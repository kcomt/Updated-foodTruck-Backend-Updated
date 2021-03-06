package com.kcomt.carritos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.kcomt.carritos.entities.Sale;
import com.kcomt.carritos.repository.SaleRepository;
import com.kcomt.carritos.service.ISaleService;

@Service
public class SaleServiceImpl implements ISaleService{

	@Autowired
	private SaleRepository saleRepository;
	
	@Transactional(readOnly=true)
	@Override
	public List<Sale> findAll() throws Exception {
		// TODO Auto-generated method stub
		return saleRepository.findAll();
	}

	@Transactional
	@Override
	public Sale save(Sale t) throws Exception {
		// TODO Auto-generated method stub
		return saleRepository.save(t);
	}

	@Transactional
	@Override
	public Sale update(Sale t) throws Exception {
		// TODO Auto-generated method stub
		return saleRepository.save(t);
	}

	@Transactional(readOnly=true)
	@Override
	public Optional<Sale> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return saleRepository.findById(id);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		saleRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		saleRepository.deleteAll();
	}

	@Transactional(readOnly=true)
	@Override
	public List<Sale> fetchByBuisnessOwnerId(int id) throws Exception {
		// TODO Auto-generated method stub
		return saleRepository.fetchByBuisnessOwnerId(id);
	}

}
