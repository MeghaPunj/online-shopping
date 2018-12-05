package com.cart.shoppingbackend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cart.shoppingbackend.dao.CategoryDAO;
import com.cart.shoppingbackend.domain.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> listofCategories = new ArrayList<>();
	static {
		Category category = new Category();
		category.setCategoryid(1);
		category.setName("TV");
		category.setDescription("This is the TV Category");
		listofCategories.add(category);
		
		Category category2 = new Category();
		category2.setCategoryid(2);
		category2.setName("Mobiles");
		category2.setDescription("This is the Mobile Category");
		listofCategories.add(category2);
		
		Category category3 = new Category();
		category3.setCategoryid(3);
		category3.setName("Laptops");
		category3.setDescription("This is the Laptop Category");
		listofCategories.add(category3);
	}
	
	@Override
	public List<Category> listCategories() {
		
		return listofCategories;
	}

	@Override
	public Category get(int id) {
		for (Category category: listofCategories) {
			if (category.getCategoryid()==id) {
				return category;
			}
		}
		return null;
	}

}
