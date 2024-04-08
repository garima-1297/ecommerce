package com.mvc.ecommerce.controller;

import com.mvc.ecommerce.entity.Category;
import com.mvc.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/addCategory")
    Category addCategory(@RequestBody Category category){

        return categoryService.addCategory(category);
    }
}
