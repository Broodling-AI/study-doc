package day01;

public class User {
	
	private String name;
	private int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//չʾ�û���Ϣ����
	public void showUser(){
		System.out.println("�������"+this.name+",������"+this.age);
	}
	
	
	

}
