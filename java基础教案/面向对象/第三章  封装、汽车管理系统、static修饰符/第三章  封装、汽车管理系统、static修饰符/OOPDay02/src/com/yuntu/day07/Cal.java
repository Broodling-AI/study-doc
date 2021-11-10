package com.yuntu.day07;

import java.util.Arrays;

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

	/**
	 * 有返回值有参方法
	 * 以数组为参数，以数组为返回值
	 * @param score
	 * @return
	 */
	public int[] sortScore(int[] score) {
		Arrays.sort(score);
		return score;
	}

}
