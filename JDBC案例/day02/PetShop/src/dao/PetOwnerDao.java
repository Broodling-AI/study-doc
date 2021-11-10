package dao;

import java.util.List;

import entity.PetOwner;

public interface PetOwnerDao {
	/**
	 * 查询所有宠物主人
	 * @return
	 */
	List<PetOwner> getPetOwnerAlls();

	/**
	 * 根据条件查询，返回PetOwer对象
	 * @param sql
	 * @param param
	 * @return
	 */
	PetOwner selectOwner(String sql, Object[] param);	
}
