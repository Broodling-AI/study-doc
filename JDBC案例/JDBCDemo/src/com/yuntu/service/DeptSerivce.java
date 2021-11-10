package com.yuntu.service;

import com.yuntu.entity.Dept;

public interface DeptSerivce {
	
	/**
	 * 登录
	 * @param name  部门名称
	 * @param password 部门登录密码
	 * @return
	 */
	Dept  login(String name,String password);
}
