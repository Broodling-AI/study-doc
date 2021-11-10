package com.yuntu.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTest1 {
	public static void main(String[] args) {
		JDBCDemo d=new JDBCDemo();
		d.showStudentList();
	}
}
