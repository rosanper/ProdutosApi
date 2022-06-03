package com.micro.products.dto;

import com.micro.products.enumerator.Size;
import com.micro.products.model.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductResponse extends ProductRequest{
    @Id
    private String Id;

    public ProductResponse(Product product) {
        this.setId(product.getId());
        this.setName(product.getName());
        this.setPrice(product.getPrice());
        this.setQuantity(product.getQuantity());
        this.setDescription(product.getDescription());
        this.setCategory(product.getCategory());
        if (product.getSize() == null){
            this.setSize(Size.M);
        } else {
            this.setSize(product.getSize());
        }
    }

    public static List<ProductResponse> toResponse(List<Product> products){

        return products.stream().map(ProductResponse::new).collect(Collectors.toList());
    }
}
