package test;

import java.util.Scanner;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;

public class Test01 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);	
	System.out.print("请输入用户名：");
	String iName=input.next();
	System.out.print("请输入密码：");
	String iPwd=input.next();
	 //创建了数据访问层对象
	 StudentDao dao= new StudentDaoImpl(); 
	 boolean flag= dao.login(iName, iPwd);
	 if (flag) {
		System.out.println("登录成功！");
	}else{
		System.out.println("登录失败！");
	}
		
	}
}
