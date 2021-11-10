package com.yuntu.day03;

public class Computer {
	String name;
	int score;
	String action;
	int num;
	
	   public void method(){
           /**
           *随机产生数字123
           */
       num=(int)((Math.random())*3)+1;
       switch(num){
       case 1:
           action="剪刀";
           break;
       case 2:
           action="石头";
           break;
       case 3:
           action="布";
           break;
       }
       System.out.println(name+"出拳："+action);
       
   }
}
