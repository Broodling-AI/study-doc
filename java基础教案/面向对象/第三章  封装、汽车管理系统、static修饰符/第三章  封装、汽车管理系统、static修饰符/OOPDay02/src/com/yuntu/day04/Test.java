package com.yuntu.day04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);	
	   Admin admin=new Admin();	
	   String jixu;//�Ƿ����
	   do {
		   System.out.print("������ͻ���������");
		   String newName=input.next();
		   admin.addName(newName);
		   System.out.print("�Ƿ��������?(y/n):");
		   jixu=input.next();
	} while ("y".equals(jixu));
	   
	admin.showNamesList();
	
	}
}
