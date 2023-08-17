package com.desk.shopmanagement.model;

import com.desk.shopmanagement.Enum.DeliveryStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
@Entity
@Table(name = "DELIVERY")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeliveryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "deliveryDate")
    private Date delivery_date;
    @ManyToMany
    private Collection<InvoiceModel> invoices;
    @OneToMany
    private Collection<DriverModel> driver;
    @Column(name = "status")
    private DeliveryStatus deliveryStatus;

    @OneToOne
    private AddressModel address;
}
