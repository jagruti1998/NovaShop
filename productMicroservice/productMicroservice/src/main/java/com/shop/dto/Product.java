package com.shop.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "product")
public class Product {

    @Id
    private int id;

    @NotNull(message = "product name should not be null")
    private String name;

    @NotNull(message = "category should not be null")
    private Category category;

    @Min(0)//i don't want to be negative
    private double price;

    private String currency;

    @Max(100)//max 100% discount we can offer
    private double discount;
    private String discountDescription;



}

