package com.desk.shopmanagement.model;

import com.desk.shopmanagement.Enum.VehiculeType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table(name = "VEHICLE")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "registrationNumber")
    private String registration_number;
    @Column(name = "vehicleType")
    private VehiculeType type;
    @Column(name = "vehicleModel")
    private String model;
    @Column(name = "aquisitionDate")
    private Date aquisition_date;
}
