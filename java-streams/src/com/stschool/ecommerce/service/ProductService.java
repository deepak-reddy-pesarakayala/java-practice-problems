package com.stschool.ecommerce.service;

import com.stschool.ecommerce.exception.ProductNotFound;
import com.stschool.ecommerce.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductsByAvailability(boolean isAvailable);
    List<Product> getProductByCategory(String category);
    Product getProductById(int id) throws ProductNotFound;
    List<String> getAllCategories();
}