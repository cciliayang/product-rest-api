package com.example.springbootcassandraexample.service;

import com.example.springbootcassandraexample.entity.Product;
import com.example.springbootcassandraexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
//        product.setProductId(product.getProductId());
//        product.setProductName(product.getProductName());
//        product.setProductBrand(product.getProductBrand());
//        product.setProductPrice(product.getProductPrice());
//        product.setProductQuantity(product.getProductQuantity());
        return productRepository.save(product);
    }

    public Product findByIdProduct(UUID productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public void deleteProduct(UUID productId) {
        productRepository.deleteById(productId);

    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

}
