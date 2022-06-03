package com.micro.products.dto;

import com.micro.products.enumerator.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class FindProductByCategory {
    private Category category;
}
