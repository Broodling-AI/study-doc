package com.zgjy.thread;

// 1. �Զ���һ���߳���,�̳�Thread��
public class MyThread extends Thread {
	// 2. ��дThread�е�run�ķ���,run������д����Ҫ�������еĴ���
	@Override
	public void run() {
		
		for(int i = 0 ; i < 10 ; i ++) {
			
			System.out.println("run "+i);
		}
		
	}
	

}
