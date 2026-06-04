package com.stschool.ecommerce.repository;

import com.stschool.ecommerce.model.Product;
import com.stschool.ecommerce.util.CsvReader;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private final CsvReader csvReader;
    private final List<Product> products;

    public ProductRepository(CsvReader csvReader) throws IOException {
        this.csvReader = csvReader;
        this.products = this.csvReader.getProductFromCsv();
    }

    public List<Product> findAll(){
        return products;
    }
    public Optional<Product> findById(int id){
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }
    public Product update(Product product){
        return (Product) products.stream().filter(p -> p.getId() == product.getId()).map(p -> {
            p.setName(product.getName());
            p.setMaxRetailPrice(product.getMaxRetailPrice());
            p.setDiscountPercentage(product.getDiscountPercentage());
            p.setAvailable(product.isAvailable());
            p.setCompany(product.getCompany());
            p.setCategory(product.getCategory());
            p.setManufacturedYear(product.getManufacturedYear());
            return p;
        });

    }

    public void delete(int id){
        products.removeIf(p -> p.getId() == id);
    }
}