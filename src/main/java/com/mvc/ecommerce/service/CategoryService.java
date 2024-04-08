package com.mvc.ecommerce.service;

import com.mvc.ecommerce.entity.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    Category addCategory(Category category);
}
