package com.zgjy.threadsafe;

// ����һ����Ʊ����SaleTickets,ʵ��Runnable�ӿ�,����Ʊ���̶�����run������
public class SaleTickets implements Runnable{
    // ����һ����Ա����, Ʊ��������100��
	int tickets = 100;
	
	@Override
	public void run() {// ������Ʊ����
		// ֻҪ����ʣ���Ʊ,�ܹ�����,һ������һ��
		while(tickets > 0) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "���۵�"+(tickets--)+"��Ʊ");
		}
	}
}
