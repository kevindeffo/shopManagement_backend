package com.desk.shopmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCTS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    private CategoryModel category;
    @Column(name = "availableQuantity")
    private int available_quantity;
    @Column(name = "unitPrice")
    private double unit_price;

}
