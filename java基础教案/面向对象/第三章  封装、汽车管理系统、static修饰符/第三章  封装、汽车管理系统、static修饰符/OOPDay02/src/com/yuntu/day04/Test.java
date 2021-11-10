package com.yuntu.day04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);	
	   Admin admin=new Admin();	
	   String jixu;//是否继续
	   do {
		   System.out.print("请输入客户的姓名：");
		   String newName=input.next();
		   admin.addName(newName);
		   System.out.print("是否继续输入?(y/n):");
		   jixu=input.next();
	} while ("y".equals(jixu));
	   
	admin.showNamesList();
	
	}
}
