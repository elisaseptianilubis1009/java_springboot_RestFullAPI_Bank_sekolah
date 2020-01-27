package com.bank_sekolah.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tb_penarikan")
@EntityListeners(AuditingEntityListener.class)
public class ModelPenarikan {
	@Id
	private String id;
	private String nim;
	private String tanggal_penarikan;
	private String besar_penarikan;
	
	public ModelPenarikan(String id, String nim, String tanggal_penarikan, String besar_penarikan) {
		super();
		this.id = id;
		this.nim = nim;
		this.tanggal_penarikan = tanggal_penarikan;
		this.besar_penarikan = besar_penarikan;
	}
	public ModelPenarikan() {
		
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
	public String getTanggal_penarikan() {
		return tanggal_penarikan;
	}
	public void setTanggal_penarikan(String tanggal_penarikan) {
		this.tanggal_penarikan = tanggal_penarikan;
	}
	public String getBesar_penarikan() {
		return besar_penarikan;
	}
	public void setBesar_penarikan(String besar_penarikan) {
		this.besar_penarikan = besar_penarikan;
	}
	
	
}
