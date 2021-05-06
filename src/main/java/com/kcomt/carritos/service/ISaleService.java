package com.kcomt.carritos.service;

import java.util.List;


import com.kcomt.carritos.entities.Sale;

public interface ISaleService extends CrudService<Sale>{

	List<Sale> fetchByBuisnessOwnerId(int id) throws Exception;
}
