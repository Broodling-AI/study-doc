package com.yuntu.day08;

import java.util.Arrays;

public class Cal {

	/**
	 * �õ�ƽ���ַ���
	 * @param score ����
	 * @return ƽ����
	 */
	public int getAvgScore(int[] score) {
		int total=0;
		for (int i = 0; i < score.length; i++) {
			//�ۼ��ܷ�
			total=total+score[i];
		}
		return total/score.length;
	}

	/**
	 * �з���ֵ�вη���
	 * ������Ϊ������������Ϊ����ֵ
	 * @param score
	 * @return
	 */
	public void  sortScore(int[] score1) {
		Arrays.sort(score1);
	}

	public void change(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
	}

}
