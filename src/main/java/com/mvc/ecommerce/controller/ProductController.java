package com.mvc.ecommerce.controller;

import com.mvc.ecommerce.entity.Product;
import com.mvc.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/getproduct")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getproduct/{id}")
    public Product getProductById(@PathVariable("id") long productId){
        return productService.getProductById(productId);
    }

    @PutMapping("/updateproduct/{id}")
    public Product updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){
        return productService.updateProduct(productId, product);
    }

    @DeleteMapping("/deleteproduct/{id}")
    public String deleteProductById(@PathVariable("id") long productId){
        return productService.deleteProductById(productId);
    }

}
