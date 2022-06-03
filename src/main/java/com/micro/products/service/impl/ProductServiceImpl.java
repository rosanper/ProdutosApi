package com.micro.products.service.impl;

import com.micro.products.dto.ProductRequest;
import com.micro.products.dto.ProductResponse;
import com.micro.products.enumerator.Category;
import com.micro.products.model.Product;
import com.micro.products.repository.ProductRepository;
import com.micro.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Flux<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Mono<Product> createProduct(ProductRequest request) {

        Product product = Product.fromRequest(request);
        return productRepository.save(product);
    }

    @Override
    public Mono<Product> findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public Flux<Product> findByCategory(Category category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public Mono<Void> deleteProduct(String id) {
        return productRepository.deleteById(id);
    }
}
