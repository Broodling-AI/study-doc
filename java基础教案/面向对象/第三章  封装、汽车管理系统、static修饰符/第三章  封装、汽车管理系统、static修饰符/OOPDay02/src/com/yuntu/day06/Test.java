package com.yuntu.day06;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int score[]=new int[5];
	for (int i = 0; i < score.length; i++) {
		System.out.println("�������"+(i+1)+"��ѧ��:");
		score[i]=input.nextInt();
	}
	Cal cal=new Cal();
	//��������Ϊ�����Ĳ���
	int avgScore=cal.getAvgScore(score);
	System.out.println("ƽ�����ǣ�"+avgScore);
	
	}
}
