package com.yuntu.day07;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int score[]=new int[5];
	for(int i = 0; i < score.length; i++) {
		System.out.println("�������"+(i+1)+"��ѧ��:");
		score[i]=input.nextInt();
	}
	Cal cal=new Cal();
	//��������Ϊ�����Ĳ������ҷ����µ�����
	int newScore[]=cal.sortScore(score);
	System.out.println(Arrays.toString(newScore));
	
	}
}
