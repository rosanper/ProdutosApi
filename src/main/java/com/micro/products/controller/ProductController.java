package com.micro.products.controller;

import com.micro.products.dto.ProductRequest;
import com.micro.products.enumerator.Category;
import com.micro.products.model.Product;
import com.micro.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Mono<Product> createProduct(@RequestBody ProductRequest request){
        return productService.createProduct(request);
    }

    @GetMapping
    public Flux<Product> findAllProducts(){
        return productService.findAllProducts();
    }

    @GetMapping("/{id}")
    public Mono<Product> findById(@PathVariable String id){
        return productService.findById(id);
    }

    @GetMapping("/category")
    public Flux<Product> findByCategory(@RequestBody Category category) {
        return productService.findByCategory(category);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable String id){
        return productService.deleteProduct(id);
    }
}
