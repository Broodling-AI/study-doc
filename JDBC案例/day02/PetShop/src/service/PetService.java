package service;

import java.util.List;

import entity.Pet;

public interface PetService {

	/**
	 * 获取所有宠物列表
	 * @return
	 */
	List<Pet> getPetList();
	
}
