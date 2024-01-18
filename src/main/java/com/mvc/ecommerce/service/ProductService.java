package com.mvc.ecommerce.service;

import com.mvc.ecommerce.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long productId);
    Product updateProduct(Long productId, Product product);
    String deleteProductById(Long productId);

}
