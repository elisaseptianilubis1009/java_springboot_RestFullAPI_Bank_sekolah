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
import org.springframework.web.bind.annotation.RestController;

import com.bank_sekolah.dao.daoSetoran;
import com.bank_sekolah.model.*;

@RestController
public class ControllerSetoran {
	
	@Autowired
	daoSetoran ds;
	
	@RequestMapping("/setoran")
	public List<ModelSetoran> get(){
		return ds.GetAll();
	}
	
	@GetMapping("/setoran/{id}")
	public ModelSetoran getOne(@PathVariable String id){
		return ds.GetOne(id);
	}
	
	@PostMapping("/setoran")
	public void save(@RequestBody ModelSetoran ms){
		ds.add(ms);
	}
	
	@PutMapping("/setoran/{id}")
	public void edit(@RequestBody ModelSetoran ms,String id){
		ds.update(ms, id);
	}
	@DeleteMapping("/setoran/{id}")
	public void edit(@PathVariable String id){
		ds.delete(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
