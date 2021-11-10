package test;

import java.util.Scanner;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;

public class Test03 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("请输入需要删除的学号：");
	String delNo=input.next();
	//创建dao对象，调用实现删除方法
	StudentDao dao=new StudentDaoImpl();
	boolean flag= dao.delete(Integer.parseInt(delNo));
	if (flag) {
		System.out.println("删除成功！");
	}else{
		System.out.println("删除失败!");
	}
			
	}
}

