package service;

import java.util.List;

import entity.Account;
import entity.Pet;
import entity.PetOwner;

public interface Accountable {
	
	/**
	 * 修改宠物商店台帐信息
	 */
	public int modifyAccount(Pet pet, PetOwner owner);
	
	
	/**
	 * 查询宠物商店台帐信息
	 */
	public List<Account> account(long storeId);
	
}
