package com.altimetrik.altishop.controller;

import com.altimetrik.altishop.exception.ProductIdNotExistsException;
import com.altimetrik.altishop.model.Product;
import com.altimetrik.altishop.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/product-api")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping(value = "/product")
    public Product addProduct(@RequestBody @Valid Product product) {// throw new MethodInvalidArgException();
        return productService.addProduct(product);
    }
    @GetMapping(value = "/product")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @GetMapping(value = "/product/{id}")
    public Product getProductById(@PathVariable("id") int productId) throws ProductIdNotExistsException {
        return productService.getProductById(productId);
    }
    @PutMapping(value = "/product")
    public Product updateProduct(@RequestBody  Product product) throws ProductIdNotExistsException {
        return productService.updateProduct(product);
    }
    @DeleteMapping(value = "/product/{id}")
    public String deleteProductById(@PathVariable("id") int productId) throws ProductIdNotExistsException {
        return productService.deleteProductById(productId);
    }
}
