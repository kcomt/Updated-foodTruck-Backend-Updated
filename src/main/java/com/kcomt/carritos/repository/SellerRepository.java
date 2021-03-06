package com.kcomt.carritos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kcomt.carritos.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer> {

	@Query("select r from Seller r where r.buisnessOwnerId.id =?1")
	List<Seller> fetchByBuisnessOwnerId(int id);
	
	Seller findByUsername(String username);
}
