package com.micro.products.model;

import com.micro.products.dto.ProductRequest;
import com.micro.products.enumerator.Category;
import com.micro.products.enumerator.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@NoArgsConstructor
@Getter @Setter
@ToString
public class Product {
    @Id
    private String id;
    @NotNull
    private String name;
    @NotNull
    private BigDecimal price;
    @Min(value = 0L, message = "The value must be positive")
    @NotNull
    private Integer quantity;
    private String description;
    @NotNull
    private Category category;
    private Size size;

    public static Product fromRequest(ProductRequest request){
        Product product = new Product();
        product.setId(UUID.randomUUID().toString());
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());
        product.setDescription(request.getDescription());
        product.setCategory(request.getCategory());
        product.setSize(request.getSize());

        return product;
    }
}
