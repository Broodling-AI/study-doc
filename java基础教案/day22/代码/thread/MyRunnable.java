package com.zgjy.thread;

// 1. �Զ���һ���߳���, ʵ��Runnable�ӿ�
public class MyRunnable implements Runnable{
    //2.��д�ӿ��еķ���run, ��Ҫ�������еĴ���,д��run��
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i ++) {
			
			System.out.println("runnable "+i);
		}
		
	}

}
