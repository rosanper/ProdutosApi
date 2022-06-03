package com.micro.products.service;

import com.micro.products.dto.ProductRequest;
import com.micro.products.dto.ProductResponse;
import com.micro.products.enumerator.Category;
import com.micro.products.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ProductService {
    Flux<Product> findAllProducts();
    Mono<Product> createProduct(ProductRequest request);
    Mono<Product> findById(String id);
    Flux<Product> findByCategory(Category category);
    Mono<Void> deleteProduct(String id);
}
