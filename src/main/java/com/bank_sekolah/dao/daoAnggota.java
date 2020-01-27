package com.bank_sekolah.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank_sekolah.model.ModelAnggota;
import com.bank_sekolah.repository.RepositoryAnggota;

@Service
public class daoAnggota {
	
	@Autowired
	private RepositoryAnggota Ranggota;
	
	public List<ModelAnggota> getAll(){
		return Ranggota.findAll();
	}
	public ModelAnggota getid(String nim){
		return  Ranggota.findOne(nim);
		
	}
	
	public void save(ModelAnggota data){
		Ranggota.save(data);
	}
	
	public void update(ModelAnggota data,String nim){
		Ranggota.save(data);
	}
	
	public void deleted(String id){
		Ranggota.delete(id);
	}
	
}
