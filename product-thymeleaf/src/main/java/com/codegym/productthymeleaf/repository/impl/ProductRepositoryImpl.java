package com.codegym.productthymeleaf.repository.impl;

import com.codegym.productthymeleaf.models.Product;
import com.codegym.productthymeleaf.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private static Map<Integer, Product> listProduct;

    static {
        listProduct = new HashMap<>();
        listProduct.put(1, new Product(1,"IphoneX",15000000,"Bảo hành 1 năm","Hàng New","Apple"));
        listProduct.put(2, new Product(2,"SamSungA8",7000000,"Bảo hành 1 năm","Hàng New","SamSung"));
        listProduct.put(3, new Product(3,"Iphone8plus",8500000,"Bảo hành 1 năm","Hàng 99%","Apple"));
        listProduct.put(4, new Product(4,"OppoNeo9",6500000,"Bảo hành 1 năm","Hàng 99%","Oppo"));
        listProduct.put(5, new Product(5,"IphoneXSMas",25000000,"Bảo hành 1 năm","Hàng New","Apple"));
        listProduct.put(6, new Product(6,"Iphone7plus",10000000,"Bảo hành 1 năm","Hàng New","Apple"));
        listProduct.put(7, new Product(7,"SamSungS10",12000000,"Bảo hành 1 năm","Hàng New","Apple"));
        listProduct.put(8, new Product(8,"Iphone11",30000000,"Bảo hành 1 năm","Hàng New","Apple"));
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(listProduct.values());
    }

    @Override
    public Product getById(int id) {
        return listProduct.get(id);
    }

    @Override
    public void deleteById(int id) {
        listProduct.remove(id);
    }

    @Override
    public void save(Product product) {
        listProduct.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        listProduct.put(id, product);
    }
}
