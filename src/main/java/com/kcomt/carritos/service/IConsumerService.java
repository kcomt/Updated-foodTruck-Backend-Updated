package com.kcomt.carritos.service;

import com.kcomt.carritos.entities.Consumer;

public interface IConsumerService extends CrudService<Consumer>{
	public Consumer findByUsername(String username);
	
}
