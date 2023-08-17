package com.desk.shopmanagement.model;

import com.desk.shopmanagement.Enum.InvoiceStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.Collection;
@Entity
@Table(name = "INVOICES")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "invoiceStatus")
    private InvoiceStatus invoiceStatus;

    @ManyToOne
    private CustomerModel customer;

    @ManyToOne
    private BillerModel biller;

    @OneToMany(mappedBy = "invoice")
    private Collection<InvoiceItemModel> invoiceItems;

    @Column(name = "totalAmount")
    private double total_amount;

    @ManyToMany(mappedBy = "invoices", fetch = FetchType.LAZY)
    private Collection<DeliveryModel> deliveries;
}
