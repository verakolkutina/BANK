package com.example.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "status")
    private String status;

    @Column(name = "tax_code")
    private String tax_code;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "lust_name")
    private String lust_name;

    @Column(name = "email")
    private String email;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "updated_at")
    private Timestamp update_at;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private int phone;

    @Column(name = "manager_id")
    private UUID manager_id;



}
