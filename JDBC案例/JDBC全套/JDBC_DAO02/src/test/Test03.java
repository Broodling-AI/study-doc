package test;

import java.util.Scanner;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;

public class Test03 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("��������Ҫɾ����ѧ�ţ�");
	String delNo=input.next();
	//����dao���󣬵���ʵ��ɾ������
	StudentDao dao=new StudentDaoImpl();
	boolean flag= dao.delete(Integer.parseInt(delNo));
	if (flag) {
		System.out.println("ɾ���ɹ���");
	}else{
		System.out.println("ɾ��ʧ��!");
	}
			
	}
}

