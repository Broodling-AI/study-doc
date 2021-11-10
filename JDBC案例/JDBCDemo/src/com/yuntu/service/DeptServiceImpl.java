package com.yuntu.service;

import com.yuntu.dao.DeptDao;
import com.yuntu.dao.DeptDaoImpl;
import com.yuntu.entity.Dept;

/**
 * 业务层
 * @author Administrator
 *
 */
public class DeptServiceImpl  implements DeptSerivce{
	
	
	//创建数据访问层对象
	DeptDao deptDao=new DeptDaoImpl();
	
	@Override
	public Dept login(String name, String password) {
		//业务层要调用数据访问层的部门登录方法
		Dept dept= deptDao.loginByDept(name,password);
		return dept;
	}

}
