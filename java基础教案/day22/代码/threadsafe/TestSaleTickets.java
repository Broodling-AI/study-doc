package com.zgjy.threadsafe;

public class TestSaleTickets {

	public static void main(String[] args) {
		// 1. 因为有三个渠道同时卖票, 定义出三个彼此独立的线程
		// SaleTickets st = new SaleTickets();
		// 2. 使用线程安全的售票代码
		SaleTicketsSafe st = new SaleTicketsSafe();
		Thread t1 = new Thread(st,"美团");
		Thread t2 = new Thread(st,"猫眼");
		Thread t3 = new Thread(st,"影院");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
