package dao;

import java.util.List;

import entity.Pet;

public interface PetDao {
	
	/**
	 * ��ȡ���г����б�
	 * @return
	 */
	List<Pet> getPetAlls();

}
