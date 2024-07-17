package com.example.demo.products;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private int price;
    private int quantity;
    private String description;
    private String category;
    private String brand;
    private String color;
    private String size;
    private String image;
}
