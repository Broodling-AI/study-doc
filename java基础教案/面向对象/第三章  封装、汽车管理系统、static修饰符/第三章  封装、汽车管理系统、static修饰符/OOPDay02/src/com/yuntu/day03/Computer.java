package com.yuntu.day03;

public class Computer {
	String name;
	int score;
	String action;
	int num;
	
	   public void method(){
           /**
           *�����������123
           */
       num=(int)((Math.random())*3)+1;
       switch(num){
       case 1:
           action="����";
           break;
       case 2:
           action="ʯͷ";
           break;
       case 3:
           action="��";
           break;
       }
       System.out.println(name+"��ȭ��"+action);
       
   }
}
