package service;

import java.util.List;

import entity.Pet;

public interface PetService {

	/**
	 * ��ȡ���г����б�
	 * @return
	 */
	List<Pet> getPetList();
	
}
