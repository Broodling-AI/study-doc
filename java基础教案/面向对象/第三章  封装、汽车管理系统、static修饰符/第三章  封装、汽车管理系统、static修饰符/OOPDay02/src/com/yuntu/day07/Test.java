package com.yuntu.day07;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int score[]=new int[5];
	for(int i = 0; i < score.length; i++) {
		System.out.println("请输入第"+(i+1)+"个学生:");
		score[i]=input.nextInt();
	}
	Cal cal=new Cal();
	//把数组作为方法的参数并且返回新的数组
	int newScore[]=cal.sortScore(score);
	System.out.println(Arrays.toString(newScore));
	
	}
}
