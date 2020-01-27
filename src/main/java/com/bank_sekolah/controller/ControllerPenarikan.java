package com.bank_sekolah.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bank_sekolah.model.ModelPenarikan;

import com.bank_sekolah.dao.daoPenarikan;

@RestController
public class ControllerPenarikan {
	@Autowired
	daoPenarikan daop;
	
	@GetMapping("/penarikan")
	public List<ModelPenarikan> getAll(){
		return daop.getAll();
		
	}
	@GetMapping("/penarikan/{id}")
	public ModelPenarikan getone(@PathVariable String id){
		return daop.getId(id);
	}
	
	@PostMapping("/penarikan")
	public void save(@RequestBody ModelPenarikan data){
		data.setId(null);
		daop.add(data);
	}
	
	@PutMapping("/penarikan/{id}")
	public void update(@RequestBody ModelPenarikan data,String id){
		daop.update(data, id);
	}
	
	@DeleteMapping("/penarikan/{id}")
	public void delete(@PathVariable String id){
		daop.delete(id);
	}
	
}
