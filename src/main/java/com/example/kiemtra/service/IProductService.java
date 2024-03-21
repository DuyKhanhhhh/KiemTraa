package com.example.kiemtra.service;

import com.example.kiemtra.model.Product;

import java.util.List;

public interface IProductService extends IGenerateService<Product>{
    List<Product> findByPriceBetween(double minPrice, double maxPrice);
    List<Product> findAllByOrderByAmountDesc();
    List<Product> findTop3ByOrderByPriceDesc();
    List<Product> findByCategoryName(String categoryName);

}