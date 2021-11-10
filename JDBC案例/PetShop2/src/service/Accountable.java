package service;

import java.util.List;

import entity.Account;
import entity.Pet;
import entity.PetOwner;

public interface Accountable {
	
	/**
	 * �޸ĳ����̵�̨����Ϣ
	 */
	public int modifyAccount(Pet pet, PetOwner owner);
	
	
	/**
	 * ��ѯ�����̵�̨����Ϣ
	 */
	public List<Account> account(long storeId);
	
}
