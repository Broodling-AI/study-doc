package com.yuntu.caiquan;

import java.util.Random;

/**
 * ������
 * @author Administrator
 *
 */
public class Computer {
	
	String name;//����
	int score;//����
	
	/**
	 * ��ȭ
	 * @return ��ȭ���ֵ
	 */
	public int chuquan() {
	    Random random=new Random();
	    int num=random.nextInt(3)+1;
	    switch (num) {
		case 1:
			System.out.println(name+"��ȭ������");
			break;
		case 2:
			System.out.println(name+"��ȭ��ʯͷ");
			break;
		default:
			System.out.println(name+"��ȭ����");
			break;
		}
		return num;
	}
	
}
