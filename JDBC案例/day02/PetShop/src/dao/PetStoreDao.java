package dao;

import java.util.List;

import entity.Pet;
import entity.PetStore;

public interface PetStoreDao {
	/**
	 * 查询所有宠物商店
	 * @return
	 */
	List<PetStore> getPetSotreAlls();

	/**
	 *根据条件查询查询出宠物列表
	 * @param sql
	 * @param param
	 * @return
	 */
	List<Pet> selectPet(String sql, Object[] param);	
}
