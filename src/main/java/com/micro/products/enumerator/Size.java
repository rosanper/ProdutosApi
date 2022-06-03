package com.micro.products.enumerator;

import lombok.Getter;

@Getter
public enum Size {
    S("Small"), M("Medium"), L("Large");

    private String label;
    private Size(String label) {
        this.label = label;
    }
}
