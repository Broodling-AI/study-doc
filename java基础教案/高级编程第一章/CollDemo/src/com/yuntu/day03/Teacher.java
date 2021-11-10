package com.yuntu.day03;

public class Teacher {
	
	private String name;
	private int price;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public Teacher(){}
	
	public Teacher(String name,int price){
		this.name=name;
		this.price=price;
	}
	
	public void showStudent(){
		System.out.println("我是"+name+"年龄是"+price);
	}

}
