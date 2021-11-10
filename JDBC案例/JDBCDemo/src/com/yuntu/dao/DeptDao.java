package com.yuntu.dao;

import com.yuntu.entity.Dept;

public interface DeptDao {
	
	/**
	 * 根据部门名称和密码登录，返回查询到的部门信息这条对象
	 * @param name
	 * @param password
	 * @return
	 */
	Dept loginByDept(String name,String password);

}
