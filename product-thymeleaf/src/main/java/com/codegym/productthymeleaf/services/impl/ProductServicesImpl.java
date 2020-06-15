package com.codegym.productthymeleaf.services.impl;

import com.codegym.productthymeleaf.models.Product;
import com.codegym.productthymeleaf.repository.ProductRepository;
import com.codegym.productthymeleaf.repository.impl.ProductRepositoryImpl;
import com.codegym.productthymeleaf.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesImpl implements ProductServices {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.getAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.getById(id);
    }

    @Override
    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        productRepository.update(id, product);
    }
}
