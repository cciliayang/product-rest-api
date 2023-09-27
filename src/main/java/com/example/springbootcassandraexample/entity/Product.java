package com.example.springbootcassandraexample.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Getter
@Setter
@Data
@Table(value="products")
public class Product {

    @PrimaryKey("product_id")
    private UUID productId;

    @Column("product_name")
    private String productName;
    @Column("product_brand")
    private String productBrand;
    @Column("product_price")
    private Long productPrice;
    @Column("product_quantity")
    private Long productQuantity;
}
