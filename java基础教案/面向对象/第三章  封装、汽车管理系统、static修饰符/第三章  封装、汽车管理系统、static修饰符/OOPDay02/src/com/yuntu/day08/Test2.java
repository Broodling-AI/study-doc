package com.yuntu.day08;

public class Test2 {
	public static void main(String[] args) {
	int a=10;
	int b=5;
	Cal c=new Cal();
	c.change(a,b);//把实参的值复制了一份给形参   （  值传递）
	System.out.println("a："+a+",b:"+b);
		
	}
}
