package com.yuntu.caiquan;

import java.util.Random;

/**
 * 机器类
 * @author Administrator
 *
 */
public class Computer {
	
	String name;//姓名
	int score;//积分
	
	/**
	 * 出拳
	 * @return 出拳结果值
	 */
	public int chuquan() {
	    Random random=new Random();
	    int num=random.nextInt(3)+1;
	    switch (num) {
		case 1:
			System.out.println(name+"出拳：剪刀");
			break;
		case 2:
			System.out.println(name+"出拳：石头");
			break;
		default:
			System.out.println(name+"出拳：布");
			break;
		}
		return num;
	}
	
}
