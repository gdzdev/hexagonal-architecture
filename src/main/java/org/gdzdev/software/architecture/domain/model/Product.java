package org.gdzdev.software.architecture.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Product {

    private String productId;
    private String name;
    private String description;
    private BigDecimal price;
}
