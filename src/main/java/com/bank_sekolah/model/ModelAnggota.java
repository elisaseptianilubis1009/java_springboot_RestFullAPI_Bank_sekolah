package com.bank_sekolah.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tb_anggota")

@EntityListeners(AuditingEntityListener.class)

public class ModelAnggota {
	@Id
	private String nim;
	private String nama;
	private String jenis_kelamin;
	private String tanggal;
	
	public ModelAnggota() {
		
	}
	
	public ModelAnggota(String nim, String nama, String jenis_kelamin, String tanggal, String alamat, String kelas,
			String saldo_awal) {
		super();
		this.nim = nim;
		this.nama = nama;
		this.jenis_kelamin = jenis_kelamin;
		this.tanggal = tanggal;
		this.alamat = alamat;
		this.kelas = kelas;
		this.saldo_awal = saldo_awal;
	}
	
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getJenis_kelamin() {
		return jenis_kelamin;
	}
	public void setJenis_kelamin(String jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}
	public String getTanggal() {
		return tanggal;
	}
	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getKelas() {
		return kelas;
	}
	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	public String getSaldo_awal() {
		return saldo_awal;
	}
	public void setSaldo_awal(String saldo_awal) {
		this.saldo_awal = saldo_awal;
	}
	private String alamat;
	private String kelas;
	private String saldo_awal;
	
	
	
}
