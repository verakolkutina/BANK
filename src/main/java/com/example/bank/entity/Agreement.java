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
@Table(name = "agreements")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Agreement {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "interest_rat")
    private long interest_rate;

    @Column(name = "status")
    private String status;

    @Column(name = "sum")
    private long sum;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "updated_at")
    private Timestamp updated_at;

    @Column(name = "product_id")
    private UUID product_id;

    @Column(name = "account_id")
    private UUID account_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agreement agreement)) return false;
        return getInterest_rate() == agreement.getInterest_rate() && getSum() == agreement.getSum() && Objects.equals(getId(), agreement.getId()) && Objects.equals(getStatus(), agreement.getStatus()) && Objects.equals(getCreated_at(), agreement.getCreated_at()) && Objects.equals(getUpdated_at(), agreement.getUpdated_at()) && Objects.equals(getProduct_id(), agreement.getProduct_id()) && Objects.equals(getAccount_id(), agreement.getAccount_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getInterest_rate(), getStatus(), getSum(), getCreated_at(), getUpdated_at(), getProduct_id(), getAccount_id());
    }

    @Override
    public String toString() {
        return "Agreement{" +
                "id=" + id +
                ", interest_rate=" + interest_rate +
                ", status='" + status + '\'' +
                ", sum=" + sum +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", product_id=" + product_id +
                ", account_id=" + account_id +
                '}';
    }
}
