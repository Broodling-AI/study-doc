package service;

import java.util.List;

import entity.PetOwner;

public interface PetOwnerService {
	
	/**
	 * 查询所有宠物主人
	 * @return
	 */
	List<PetOwner> getPetOwnerAlls();

	/**
	 * 宠物主人登录方法
	 * @return
	 */
	PetOwner login();	
	
}
