package dao;

import java.util.List;

import entity.Pet;

public interface PetDao {
	
	/**
	 * 获取所有宠物列表
	 * @return
	 */
	List<Pet> getPetAlls();

}
