package com.kcomt.carritos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kcomt.carritos.entities.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Integer> {
	 Consumer findByUsername(String username);
}
