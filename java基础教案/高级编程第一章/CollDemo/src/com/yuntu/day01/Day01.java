package com.yuntu.day01;

import java.util.ArrayList;
import java.util.List;

public class Day01 {
	public static void main(String[] args) {
	List list= new ArrayList(); 
//	Object list2=new Object[10];
	list.add("张三");
	list.add(1);
	list.add("李四");
	list.add(20.8);
	
//	System.out.println(list.size());
//	String name=(String)list.get(2);
//	System.out.println(name);
	
	for (int i = 0; i < list.size(); i++) {
		 System.out.println(list.get(i));
	}
	
	
	
	
	
	}
}
