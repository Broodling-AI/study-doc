package com.yuntu.day06;

public class Cal {

	/**
	 * 得到平均分方法
	 * @param score 数组
	 * @return 平均分
	 */
	public int getAvgScore(int[] score) {
		int total=0;
		for (int i = 0; i < score.length; i++) {
			//累加总分
			total=total+score[i];
		}
		return total/score.length;
	}

}
