package com.bank_sekolah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank_sekolah.model.ModelAnggota;

public interface RepositoryAnggota extends JpaRepository<ModelAnggota,String> {
	

}
