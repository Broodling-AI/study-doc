package com.zgjy.thread;

// 1. 自定义一个线程类, 实现Runnable接口
public class MyRunnable implements Runnable{
    //2.重写接口中的方法run, 需要独立运行的代码,写在run中
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i ++) {
			
			System.out.println("runnable "+i);
		}
		
	}

}
