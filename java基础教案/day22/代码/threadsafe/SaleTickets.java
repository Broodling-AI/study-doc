package com.zgjy.threadsafe;

// 定义一个卖票的类SaleTickets,实现Runnable接口,将卖票过程定义在run方法中
public class SaleTickets implements Runnable{
    // 定义一个成员变量, 票的总数量100张
	int tickets = 100;
	
	@Override
	public void run() {// 定义卖票过程
		// 只要还有剩余的票,能够销售,一次销售一张
		while(tickets > 0) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "销售第"+(tickets--)+"张票");
		}
	}
}
