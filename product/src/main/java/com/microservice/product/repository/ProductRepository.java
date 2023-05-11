package com.microservices.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservices.product.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
    
}
