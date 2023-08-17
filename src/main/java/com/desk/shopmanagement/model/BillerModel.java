package com.desk.shopmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BILLERS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BillerModel extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "email")
    private String email;
    @Column(name = "caseNumber")
    private int case_number;
}
