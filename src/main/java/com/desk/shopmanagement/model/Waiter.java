package com.desk.shopmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Table(name = "WAITER")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Waiter extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "email")
    private String email;
    @Column(name = "waiterNumber")
    private String waiter_number;
    @OneToMany
    private Collection<InvoiceModel> invoices;
}
