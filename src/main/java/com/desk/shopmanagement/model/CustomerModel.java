package com.desk.shopmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "CUSTOMERS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerModel extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "customer")
    private Collection<InvoiceModel> invoices;
}
