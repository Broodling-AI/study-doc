package com.yuntu.day06;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int score[]=new int[5];
	for (int i = 0; i < score.length; i++) {
		System.out.println("请输入第"+(i+1)+"个学生:");
		score[i]=input.nextInt();
	}
	Cal cal=new Cal();
	//把数组作为方法的参数
	int avgScore=cal.getAvgScore(score);
	System.out.println("平均分是："+avgScore);
	
	}
}
