package com.yuntu.day06;

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

}
