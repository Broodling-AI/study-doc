package com.yuntu.day08;

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
	cal.sortScore(score);//�������������ͣ��������ʹ�����Ϊ��������
	System.out.println(Arrays.toString(score));
	
	}
}
