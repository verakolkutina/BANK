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
@Table(name = "transactions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Transaction {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "type")
    private byte type;

    @Column(name = "amount")
    private byte amount;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "credit_account_id")
    private UUID credit_account_id;

    @Column(name = "debit_account_id")
    private UUID debit_account_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;
        return getType() == that.getType() && getAmount() == that.getAmount() && Objects.equals(getId(), that.getId()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getCreated_at(), that.getCreated_at()) && Objects.equals(getCredit_account_id(), that.getCredit_account_id()) && Objects.equals(getDebit_account_id(), that.getDebit_account_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getAmount(), getDescription(), getCreated_at(), getCredit_account_id(), getDebit_account_id());
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", type=" + type +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", credit_account_id=" + credit_account_id +
                ", debit_account_id=" + debit_account_id +
                '}';
    }
}