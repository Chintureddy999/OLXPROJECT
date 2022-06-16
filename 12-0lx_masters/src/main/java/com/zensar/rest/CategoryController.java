package com.zensar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.Category;
import com.zensar.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@PostMapping(value="/addCategory")
	public Category f1(@RequestBody Category category) {
		return this.categoryService.addcategory(category);
	}
	@GetMapping(value="/advertise/category")
	public List<Category> f2(){
		return this.categoryService.getAllCategories();
	}

}
