package com.micro.products.dto;

import com.micro.products.enumerator.Category;
import com.micro.products.enumerator.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductRequest {
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private String description;
    private Category category;
    private Size size;
}
