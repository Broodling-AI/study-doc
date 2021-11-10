package dao;

import java.util.List;

import entity.Pet;
import entity.PetStore;

public interface PetStoreDao {
	/**
	 * ��ѯ���г����̵�
	 * @return
	 */
	List<PetStore> getPetSotreAlls();

	/**
	 *����������ѯ��ѯ�������б�
	 * @param sql
	 * @param param
	 * @return
	 */
	List<Pet> selectPet(String sql, Object[] param);	
}
