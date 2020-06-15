package com.codegym.productthymeleaf.services;

import com.codegym.productthymeleaf.models.Product;

import java.util.List;

public interface ProductServices {
    List<Product> getAllProduct();

    Product getProductById(int id);

    void deleteProductById(int id);

    void saveProduct(Product t);

    void updateProduct(int id, Product t);
}
