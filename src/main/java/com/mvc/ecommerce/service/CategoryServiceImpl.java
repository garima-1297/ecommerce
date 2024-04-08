package com.mvc.ecommerce.service;

import com.mvc.ecommerce.entity.Category;
import com.mvc.ecommerce.entity.Product;
import com.mvc.ecommerce.repository.CategoryRepository;
import com.mvc.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public Category addCategory(Category category) {
         return categoryRepository.save(category);
    }
}

