package com.devbanck.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devbanck.entity.Banco;

@Repository("BancoRepository")
public interface BancoRepository extends JpaRepository<Banco,Serializable> {

	public abstract Banco findById(int id);
}
