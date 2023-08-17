package com.desk.shopmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
@Entity
@Table(name = "BILLERS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String Code;
    private String title;
    @OneToMany(mappedBy = "category")
    private Collection<ProductModel> invoices;
}
