package service.impl;

import java.util.List;

import dao.PetDao;
import dao.impl.PetDaoImpl;

import entity.Pet;
import service.PetService;

public class PetServiceImpl implements PetService{

	//Êý¾Ý·ÃÎÊ²ã
	PetDao petDao=new PetDaoImpl();
	
	@Override
	public List<Pet> getPetList() {
		return petDao.getPetAlls();
	}
}
