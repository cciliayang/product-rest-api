package com.example.springbootcassandraexample.repository;

import com.example.springbootcassandraexample.entity.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends CassandraRepository<Product, UUID> {

    List<Product> findByProductBrand(String productBrand);
}
