package day02;

import java.util.HashMap;
import java.util.Map;

import day01.User;

public class MapDemo {
	public static void main(String[] args) {
    //定义了map键值对集合
	Map<String,String> map= new HashMap<String,String>();
	map.put("zs","张三");
	map.put("ls","李四");
	map.put("ww","王五");
	
	//根据键获取到对应的值
	String value= map.get("ls");
	System.out.println("根据键找到值："+value);
	
	}
}
