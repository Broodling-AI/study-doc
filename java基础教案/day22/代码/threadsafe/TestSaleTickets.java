package com.zgjy.threadsafe;

public class TestSaleTickets {

	public static void main(String[] args) {
		// 1. ��Ϊ����������ͬʱ��Ʊ, ����������˴˶������߳�
		// SaleTickets st = new SaleTickets();
		// 2. ʹ���̰߳�ȫ����Ʊ����
		SaleTicketsSafe st = new SaleTicketsSafe();
		Thread t1 = new Thread(st,"����");
		Thread t2 = new Thread(st,"è��");
		Thread t3 = new Thread(st,"ӰԺ");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
