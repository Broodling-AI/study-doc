package com.yuntu.service;

import com.yuntu.dao.DeptDao;
import com.yuntu.dao.DeptDaoImpl;
import com.yuntu.entity.Dept;

/**
 * ҵ���
 * @author Administrator
 *
 */
public class DeptServiceImpl  implements DeptSerivce{
	
	
	//�������ݷ��ʲ����
	DeptDao deptDao=new DeptDaoImpl();
	
	@Override
	public Dept login(String name, String password) {
		//ҵ���Ҫ�������ݷ��ʲ�Ĳ��ŵ�¼����
		Dept dept= deptDao.loginByDept(name,password);
		return dept;
	}

}
