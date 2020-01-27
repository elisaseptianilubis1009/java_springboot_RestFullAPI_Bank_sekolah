package com.bank_sekolah.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank_sekolah.repository.RepositoryPenarikan;
import com.bank_sekolah.model.ModelPenarikan;

@Service
public class daoPenarikan {

	@Autowired
	RepositoryPenarikan Rp;
	
	public List<ModelPenarikan> getAll() {
		return Rp.findAll();
	}
	public ModelPenarikan getId(String id) {
		return Rp.findOne(id);
	}
	
	public void add(ModelPenarikan mp) {
		Rp.save(mp);
	}

	public void update(ModelPenarikan mp,String id) {
		Rp.save(mp);
	}
	
	public void delete(String id) {
		Rp.delete(id);;
	}

	
	
}
