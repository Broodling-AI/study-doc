package test;

import java.util.Scanner;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;

public class Test01 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);	
	System.out.print("�������û�����");
	String iName=input.next();
	System.out.print("���������룺");
	String iPwd=input.next();
	 //���������ݷ��ʲ����
	 StudentDao dao= new StudentDaoImpl(); 
	 boolean flag= dao.login(iName, iPwd);
	 if (flag) {
		System.out.println("��¼�ɹ���");
	}else{
		System.out.println("��¼ʧ�ܣ�");
	}
		
	}
}
