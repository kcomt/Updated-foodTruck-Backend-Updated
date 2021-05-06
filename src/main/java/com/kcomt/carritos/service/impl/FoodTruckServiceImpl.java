package com.kcomt.carritos.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcomt.carritos.entities.FoodTruck;
import com.kcomt.carritos.repository.FoodTruckRepository;
import com.kcomt.carritos.repository.ReviewRepository;
import com.kcomt.carritos.repository.SaleRepository;
import com.kcomt.carritos.service.IFoodTruckService;

@Service
public class FoodTruckServiceImpl implements IFoodTruckService{

	@Autowired
	private FoodTruckRepository foodTruckRepository;
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	@Transactional(readOnly= true)
	@Override
	public List<FoodTruck> findAll() throws Exception {
		// TODO Auto-generated method stub
		return foodTruckRepository.findAll();
	}

	@Transactional
	@Override
	public FoodTruck save(FoodTruck t) throws Exception {
		// TODO Auto-generated method stub
		return foodTruckRepository.save(t);
	}

	@Transactional
	@Override
	public FoodTruck update(FoodTruck t) throws Exception {
		// TODO Auto-generated method stub
		return foodTruckRepository.save(t);
	}

	@Transactional(readOnly=true)
	@Override
	public Optional<FoodTruck> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return foodTruckRepository.findById(id);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		reviewRepository.deleteById(id);
		foodTruckRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		foodTruckRepository.deleteAll();
	}

	@Transactional
	@Override
	public List<FoodTruck> fetchByName(String nombre) throws Exception {
		// TODO Auto-generated method stub
		return foodTruckRepository.fetchByName(nombre);
	}

	@Transactional
	@Override
	public List<FoodTruck> fetchAllFoodTruckOrderByRating() throws Exception {
		// TODO Auto-generated method stub
		return foodTruckRepository.fetchAllFoodTruckOrderByRating();
	}

	@Transactional
	@Override
	public List<FoodTruck> fetchByBuisnessOwnerId(int id) throws Exception {
		// TODO Auto-generated method stub
		return foodTruckRepository.fetchByBuisnessOwnerId(id);
	}

	
	
}
