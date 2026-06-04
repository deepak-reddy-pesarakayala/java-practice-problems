package com.java.maven.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private int id;
    private String name;
    private int maxRetailPrice;
    private int discountPercentage;
    private String company;
    private String category;
    private int manufacturedYear;

}
