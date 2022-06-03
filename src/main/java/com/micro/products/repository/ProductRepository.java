package com.micro.products.repository;

import com.micro.products.enumerator.Category;
import com.micro.products.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveCrudRepository<Product, String> {
    Flux<Product> findByCategory(Category category);
}
