package com.yuntu.day07;

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
	public int[] sortScore(int[] score) {
		Arrays.sort(score);
		return score;
	}

}
