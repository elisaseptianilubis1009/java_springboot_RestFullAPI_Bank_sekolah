package com.bank_sekolah.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank_sekolah.dao.daoAnggota;
import com.bank_sekolah.model.ModelAnggota;

@RestController
public class ControllerAnggota {
	
	@Autowired
	daoAnggota danggota;
	
	
	@GetMapping(value="/anggota")
	public List<ModelAnggota> get(){
		return danggota.getAll();
	}
	
	@RequestMapping(value="/anggota/{nim}")
	public ModelAnggota getnim(@PathVariable String nim){
		return danggota.getid(nim);
	}
	
	@PostMapping(value="/anggota")
	public void add(@RequestBody ModelAnggota data){
		danggota.save(data);
	}
	@PutMapping(value="/anggota/{nim}")
	public void update(@RequestBody ModelAnggota data,String nim){
		danggota.save(data);	
	}

	@RequestMapping(method = RequestMethod.DELETE,value="/anggota/{nim}")
	public void delete(@PathVariable String nim){
		danggota.deleted(nim);	
	}
	
	
}
