package com.bank_sekolah.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank_sekolah.repository.RepositorySetoran;
import com.bank_sekolah.model.ModelPenarikan;
import com.bank_sekolah.model.ModelSetoran;;

@Service
public class daoSetoran {
	
	@Autowired
	RepositorySetoran Rs;
	
	public List<ModelSetoran> GetAll(){
		return Rs.findAll();
	}
	
	public ModelSetoran GetOne(String id){
		return Rs.findOne(id);
	}
	
	public void add(ModelSetoran ms) {
		Rs.save(ms);
	}
	public void update(ModelSetoran ms,String id) {
		Rs.save(ms);
	}
	
	public void delete(String id) {
		Rs.delete(id);
	}
}
