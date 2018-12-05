package com.cart.shoppingbackend.dao;

import java.util.List;

import com.cart.shoppingbackend.domain.Category;

public interface CategoryDAO {

	public List<Category> listCategories();
	public Category get(int id);
	
}
