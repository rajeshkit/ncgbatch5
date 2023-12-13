package com.altimetrik.altishop.service;

import com.altimetrik.altishop.exception.ProductIdNotExistsException;
import com.altimetrik.altishop.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(int productId) throws ProductIdNotExistsException;

    Product updateProduct(Product product) throws ProductIdNotExistsException;

    String deleteProductById(int productId) throws ProductIdNotExistsException;
}
