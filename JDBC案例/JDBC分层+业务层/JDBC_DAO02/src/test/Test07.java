package test;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;

public class Test07 {
	public static void main(String[] args) {
	 StudentDao dao=new StudentDaoImpl();
	 //调用数据访问层的查询学生数量的方法
	 int count= dao.getStudentCount();
	 System.out.println("学生总人数是:"+count);
		
	}
}
