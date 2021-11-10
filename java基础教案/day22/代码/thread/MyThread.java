package com.zgjy.thread;

// 1. 自定义一个线程类,继承Thread类
public class MyThread extends Thread {
	// 2. 重写Thread中的run的方法,run方法中写上需要独立运行的代码
	@Override
	public void run() {
		
		for(int i = 0 ; i < 10 ; i ++) {
			
			System.out.println("run "+i);
		}
		
	}
	

}
