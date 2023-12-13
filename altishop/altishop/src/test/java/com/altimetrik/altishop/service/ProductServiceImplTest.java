package com.altimetrik.altishop.service;

import com.altimetrik.altishop.exception.ProductIdNotExistsException;
import com.altimetrik.altishop.model.Product;
import com.altimetrik.altishop.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {

    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductServiceImpl productServiceImpl;
    @Test
    void addProduct() {
        Product p1 = Product.builder()
                .productId(100).productName("Water Bootle")
                .productDoe(new Date()).productCost(34543).build();
        Mockito.when(productRepository.save(p1)).thenReturn(p1);
       assertEquals(p1,productServiceImpl.addProduct(p1));
    }

    @Test
    void getAllProducts() {
        Product p1 = Product.builder()
                .productId(100).productName("Water Bootle")
                .productDoe(new Date()).productCost(34543).build();
        Product p2 = Product.builder()
                .productId(101).productName("Vegitabes")
                .productDoe(new Date()).productCost(6867).build();
        Mockito.when(productRepository.findAll()).thenReturn(Arrays.asList(p1,p2));
        assertEquals(2,productServiceImpl.getAllProducts().size());
    }

    @Test
    void getProductById() throws ProductIdNotExistsException {
        Product p1 = Product.builder()
                .productId(100).productName("Water Bootle")
                .productDoe(new Date()).productCost(34543).build();

        Mockito.when(productRepository.findById(100)).thenReturn(Optional.of(p1));
        assertEquals(100,productServiceImpl.getProductById(100).getProductId());
    }
    @Test
    void getProductByIdWithException()  {
        Product p1 = Product.builder()
                .productId(100).productName("Water Bootle")
                .productDoe(new Date()).productCost(34543).build();
        Mockito.when(productRepository.findById(400)).thenReturn(Optional.empty());
        assertThrows(ProductIdNotExistsException.class,
                ()->{productServiceImpl.getProductById(400);});
    }

    @Test
    void updateProduct() {
    }

    @Test
    void deleteProductById() {
    }
}