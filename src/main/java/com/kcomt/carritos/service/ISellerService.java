package com.kcomt.carritos.service;

import java.util.List;

import com.kcomt.carritos.entities.Seller;

public interface ISellerService extends CrudService<Seller>{
	List<Seller> fetchByBuisnessOwnerId(int id) throws Exception;
	Seller findByUsername(String seller);
}
