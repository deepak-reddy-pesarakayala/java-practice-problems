package com.stschool.ecommerce.service;

import com.stschool.ecommerce.exception.ProductNotFound;
import com.stschool.ecommerce.model.Product;
import com.stschool.ecommerce.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProductsByAvailability(boolean isAvailable) {
        return productRepository.findAll().stream().filter(product -> product.isAvailable() == isAvailable).toList();
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return productRepository.findAll().stream().filter(product -> product.getCategory().equals(category)).toList();
    }

    @Override
    public Product getProductById(int id) throws ProductNotFound {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFound("Product not found with id: " + id ));
    }

    @Override
    public List<String> getAllCategories() {
        return productRepository.findAll().stream().map(Product::getCategory).distinct().toList();
    }
}