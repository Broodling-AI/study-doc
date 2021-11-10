package com.yuntu.day01;

public class Test {
	public static void main(String[] args) {
	 Student stu=new Student();
	 System.out.println(stu.name);
	 System.out.println(stu.money);
	 System.out.println(Student.money);
	 stu.show1();
	 stu.show2();//类方法也可以通过对象调用，但不建议用对象调用
	 Student.show2();
		
	}
}
