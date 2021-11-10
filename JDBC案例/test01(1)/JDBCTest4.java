package com.yuntu.test01;

public class JDBCTest4 {
	public static void main(String[] args) {
	 JDBCDemo d=new JDBCDemo();
	 d.showStudentList();
    boolean falg= d.addStudent();
    if (falg) {
		System.out.println("≤Â»Î≥…π¶£°");
		d.showStudentList();
	}
	}
}
