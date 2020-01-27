package com.bank_sekolah.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tb_setoran")
@EntityListeners(AuditingEntityListener.class)
public class ModelSetoran {
	
	@Id
	private String id;
	private String nim;
	private String besar_setoran;
	private String tanggal;
	
	public ModelSetoran(){
		
	}
	
	
	public ModelSetoran(String id, String nim, String besar_setoran, String tanggal) {
		super();
		this.id = id;
		this.nim = nim;
		this.besar_setoran = besar_setoran;
		this.tanggal = tanggal;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getBesar_setoran() {
		return besar_setoran;
	}
	public void setBesar_setoran(String besar_setoran) {
		this.besar_setoran = besar_setoran;
	}
	public String getTanggal() {
		return tanggal;
	}
	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}
	
	
	
	
	
}
