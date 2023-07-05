package com.example.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import liquibase.datatype.core.DecimalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Product {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;


    @Column(name = "status")
    private String status;

    @Column(name = "currency_code")
    private String currency_code;

    @Column(name = "interest_rate")
    private long interest_rate;

    @Column(name = "product_limit")
    private int product_limit;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "update_at")
    private Timestamp update_at;

    @Column(name = "manager_id")
    private UUID manager_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getInterest_rate() == product.getInterest_rate() && getProduct_limit() == product.getProduct_limit() && Objects.equals(getId(), product.getId()) && Objects.equals(getName(), product.getName()) && Objects.equals(getStatus(), product.getStatus()) && Objects.equals(getCurrency_code(), product.getCurrency_code()) && Objects.equals(getCreated_at(), product.getCreated_at()) && Objects.equals(getUpdate_at(), product.getUpdate_at()) && Objects.equals(getManager_id(), product.getManager_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getStatus(), getCurrency_code(), getInterest_rate(), getProduct_limit(), getCreated_at(), getUpdate_at(), getManager_id());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", currency_code='" + currency_code + '\'' +
                ", interest_rate=" + interest_rate +
                ", product_limit=" + product_limit +
                ", created_at=" + created_at +
                ", update_at=" + update_at +
                ", manager_id=" + manager_id +
                '}';
    }
}
