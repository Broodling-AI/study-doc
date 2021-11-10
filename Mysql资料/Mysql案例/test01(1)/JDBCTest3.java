package com.yuntu.test01;

public class JDBCTest3 {
	public static void main(String[] args) {
	 JDBCDemo d=new JDBCDemo();
	 d.showStudentList();
    System.out.println("____________________________________");
	 if (d.deleteStudent()>0) {
		 System.out.println("É¾³ý³É¹¦£¡");
		 System.out.println("____________________________________");
		 d.showStudentList();
	 }else{
		 System.out.println("É¾³ýÊ§°Ü£¡");
	 }
	}
}
