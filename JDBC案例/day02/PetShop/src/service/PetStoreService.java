package service;

import java.util.List;

import entity.Pet;
import entity.PetStore;

public interface PetStoreService {
	/**
	 * ��ѯ���г����̵�
	 * @return
	 */
	List<PetStore> getPetSotreList();

	/**
	 * ��ѯ�����г�� storeId ����0 ���� SELECT  * FROM pet WHERE owner_id IS NULL��
	 * ���������0����storeId��ֵ�����Ǹ����̵�IDȥ���Ҹ��̵��µĳ�����Ϣ��
	 * @param storeId
	 * @return
	 */
	List<Pet> getPetsInstock(int storeId);

	/**
	 * ���ݳ�����������۸�
	 * @param pet
	 * @return
	 */
	double charge(Pet pet);	
}
