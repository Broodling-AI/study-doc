package day01;

public class User {
	
	private String name;
	private int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//展示用户信息方法
	public void showUser(){
		System.out.println("你好我是"+this.name+",年龄是"+this.age);
	}
	
	
	

}
