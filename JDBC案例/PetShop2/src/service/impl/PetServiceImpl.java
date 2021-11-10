package service.impl;

import java.util.List;

import dao.PetDao;
import dao.impl.PetDaoImpl;

import entity.Pet;
import service.PetService;

public class PetServiceImpl implements PetService{

	//���ݷ��ʲ�
	PetDao petDao=new PetDaoImpl();
	
	@Override
	public List<Pet> getPetList() {
		return petDao.getPetAlls();
	}
}
