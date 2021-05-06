package com.kcomt.carritos.service;


import com.kcomt.carritos.entities.BuisnessOwner;
import com.kcomt.carritos.entities.Consumer;

public interface IBuisnessOwnerService extends CrudService<BuisnessOwner> {
	public BuisnessOwner findByUsername(String username);
}
