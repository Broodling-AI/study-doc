package test;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;

public class Test07 {
	public static void main(String[] args) {
	 StudentDao dao=new StudentDaoImpl();
	 //�������ݷ��ʲ�Ĳ�ѯѧ�������ķ���
	 int count= dao.getStudentCount();
	 System.out.println("ѧ����������:"+count);
		
	}
}
