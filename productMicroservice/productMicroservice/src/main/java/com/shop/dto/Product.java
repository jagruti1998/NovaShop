package com.shop.dto;

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
    private String name;
    private Category category;
    private double price;
    private String currency;
    private double discount;
    private String discountDescription;



}

