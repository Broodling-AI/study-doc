package service;

import java.util.List;

import entity.PetOwner;

public interface PetOwnerService {
	
	/**
	 * ��ѯ���г�������
	 * @return
	 */
	List<PetOwner> getPetOwnerAlls();

	/**
	 * �������˵�¼����
	 * @return
	 */
	PetOwner login();	
	
}
