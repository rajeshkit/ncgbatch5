package com.altimetrik.altishop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private int productId;
    @NotEmpty(message = "Please enter the product name")
    private String productName;
    @NotNull(message = "Please enter the product DOE")
    @Future(message = "Please enter the future date for doe")
    private Date productDoe;
    @Positive(message = "Enter the positive value for the cost")
    private float productCost;
    private boolean isAvailable;
}
