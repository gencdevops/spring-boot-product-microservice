package com.product.springbootproductmicroservice.service;

import com.product.springbootproductmicroservice.model.Product;
import com.product.springbootproductmicroservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService implements IProductService{

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product saveProduct(Product product) {
        product.setCreateTime(LocalDateTime.now());

        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
         productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

}
