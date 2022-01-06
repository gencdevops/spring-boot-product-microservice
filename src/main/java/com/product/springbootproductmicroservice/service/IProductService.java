package com.product.springbootproductmicroservice.service;

import com.product.springbootproductmicroservice.model.Product;

import java.util.List;

public interface IProductService {


    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProduct();
}
