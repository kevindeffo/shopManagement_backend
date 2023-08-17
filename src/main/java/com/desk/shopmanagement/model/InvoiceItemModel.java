package com.desk.shopmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "INVOICE_ITEMS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @OneToOne
    private ProductModel product;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "totalAmount")
    private double totalAmount;
    @ManyToOne
    private InvoiceModel invoice;
}
