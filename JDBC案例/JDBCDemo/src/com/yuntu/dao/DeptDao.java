package com.yuntu.dao;

import com.yuntu.entity.Dept;

public interface DeptDao {
	
	/**
	 * ���ݲ������ƺ������¼�����ز�ѯ���Ĳ�����Ϣ��������
	 * @param name
	 * @param password
	 * @return
	 */
	Dept loginByDept(String name,String password);

}
