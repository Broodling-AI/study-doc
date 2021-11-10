package test;

import java.util.List;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entity.Student;



public class Test06 {
	public static void main(String[] args) {
		
	StudentDao dao=new StudentDaoImpl();
	List<Student> studentList=dao.getStudentList();
	for (Student student : studentList) {
	 System.out.println(student.getStuNo()+"\t"
	+student.getStuName()+"\t"+student.getSex()+"\t"+student.getAddress()
	+"\t"+student.getBorndate());	
	}
	
		
	}
}
