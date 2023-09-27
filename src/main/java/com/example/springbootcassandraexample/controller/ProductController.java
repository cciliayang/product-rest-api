package com.example.springbootcassandraexample.controller;

import com.example.springbootcassandraexample.entity.Product;
import com.example.springbootcassandraexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable UUID id){
        return productService.findByIdProduct(id);
    }

    @PostMapping("/")
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PutMapping("/{id}")
    public  Product updateProduct(@PathVariable UUID id, @RequestBody Product product){
        product.setProductId(id);
        return productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable UUID id) {
        productService.deleteProduct(id);
    }

}
