package com.kcomt.carritos.service;

import java.util.List;

import com.kcomt.carritos.entities.Review;

public interface IReviewService extends CrudService<Review>{
	List<Review> fetchByFoodTruckId(int id)throws Exception;
}
