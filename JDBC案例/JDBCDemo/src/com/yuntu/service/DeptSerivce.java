package com.yuntu.service;

import com.yuntu.entity.Dept;

public interface DeptSerivce {
	
	/**
	 * ��¼
	 * @param name  ��������
	 * @param password ���ŵ�¼����
	 * @return
	 */
	Dept  login(String name,String password);
}
