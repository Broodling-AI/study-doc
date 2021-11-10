package service;

import java.util.List;

import entity.Pet;
import entity.PetStore;

public interface PetStoreService {
	/**
	 * 查询所有宠物商店
	 * @return
	 */
	List<PetStore> getPetSotreList();

	/**
	 * 查询出所有宠物（ storeId 传递0 代表 SELECT  * FROM pet WHERE owner_id IS NULL）
	 * （如果不是0，是storeId的值，就是根据商店ID去查找该商店下的宠物信息）
	 * @param storeId
	 * @return
	 */
	List<Pet> getPetsInstock(int storeId);

	/**
	 * 根据宠物的年龄计算价格
	 * @param pet
	 * @return
	 */
	double charge(Pet pet);	
}
