package com.desk.shopmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DRIVERS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DriverModel extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @OneToOne
    private Vehicle vehicle;

    @Column(name = "email")
    private String email;

}
