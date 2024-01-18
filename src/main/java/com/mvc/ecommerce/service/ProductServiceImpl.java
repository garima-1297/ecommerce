package com.mvc.ecommerce.service;

import com.mvc.ecommerce.entity.Product;
import com.mvc.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).get();
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        Product existingProduct = productRepository.findById(productId).orElse(null);
        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductPrice(product.getProductPrice());
        existingProduct.setProductQty(product.getProductQty());

        return productRepository.save(existingProduct);
    }

    @Override
    public String deleteProductById(Long productId) {
        productRepository.deleteById(productId);
        return "Product Deleted is: "+productId;
    }
}
