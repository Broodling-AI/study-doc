package day02;

import java.util.HashMap;
import java.util.Map;

import day01.User;

public class MapDemo {
	public static void main(String[] args) {
    //������map��ֵ�Լ���
	Map<String,String> map= new HashMap<String,String>();
	map.put("zs","����");
	map.put("ls","����");
	map.put("ww","����");
	
	//���ݼ���ȡ����Ӧ��ֵ
	String value= map.get("ls");
	System.out.println("���ݼ��ҵ�ֵ��"+value);
	
	}
}
