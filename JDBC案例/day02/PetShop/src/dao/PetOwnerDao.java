package dao;

import java.util.List;

import entity.PetOwner;

public interface PetOwnerDao {
	/**
	 * ��ѯ���г�������
	 * @return
	 */
	List<PetOwner> getPetOwnerAlls();

	/**
	 * ����������ѯ������PetOwer����
	 * @param sql
	 * @param param
	 * @return
	 */
	PetOwner selectOwner(String sql, Object[] param);	
}
