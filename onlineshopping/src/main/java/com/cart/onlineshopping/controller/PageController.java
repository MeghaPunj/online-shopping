package com.cart.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cart.shoppingbackend.dao.CategoryDAO;
import com.cart.shoppingbackend.domain.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("categories", categoryDAO.listCategories());
		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = "about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = "contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		mv.addObject("categories", categoryDAO.listCategories());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}

	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showcategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		Category category = categoryDAO.get(id);
		mv.addObject("title", category.getName());
		mv.addObject("category", category);
		mv.addObject("categories", categoryDAO.listCategories());
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}

}
