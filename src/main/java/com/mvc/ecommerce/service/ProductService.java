package com.mvc.ecommerce.service;

import com.mvc.ecommerce.entity.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    Product addProduct(Product product);

}
