package com.java.maven;

import com.java.maven.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product product = Product.builder()
                .id(103)
                .name("Shiva")
                .maxRetailPrice(28000)
                .discountPercentage(80000)
                .company("Lenevo")
                .category("Hp")
                .manufacturedYear(2024)
                .build();
        System.out.println(product);
        System.out.println( "Hello World!" );
    }
}
