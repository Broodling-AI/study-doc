package com.yuntu.test01;

public class JDBCTest2 {
	public static void main(String[] args) {
	 JDBCDemo d=new JDBCDemo();
	 System.out.println("---------------------------------");
	 d.showStudentList();
//	 d.updateStudent();
	 if (d.updateStudent()>0) {
		System.out.println("�޸ĳɹ���");
		System.out.println("---------------------------------");
		d.showStudentList();
	 }else{
		 System.out.println("�޸�ʧ�ܣ�");
	 }
	}
}
