package com.microservice.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.product.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
    
}
