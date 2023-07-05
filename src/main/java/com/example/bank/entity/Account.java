package com.example.bank.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;
@Entity
@Table(name="account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Account {

    @Id
    @GeneratedValue(generator = "UUID",strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;

    @Column (name = "name")
    private String name;

    @Column(name = "type")
    private int type;

    @Column(name = "status")
    private String status;

    @Column(name = "balance")
    private String balance;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "update_at")
    private Timestamp update_at;

    @Column(name = "client_id")
    private long client_id;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return getType() == account.getType() && getClient_id() == account.getClient_id() && Objects.equals(getId(), account.getId()) && Objects.equals(getName(), account.getName()) && Objects.equals(getStatus(), account.getStatus()) && Objects.equals(getBalance(), account.getBalance()) && Objects.equals(getCreated_at(), account.getCreated_at()) && Objects.equals(getUpdate_at(), account.getUpdate_at());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getType(), getStatus(), getBalance(), getCreated_at(), getUpdate_at(), getClient_id());
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", status='" + status + '\'' +
                ", balance='" + balance + '\'' +
                ", created_at=" + created_at +
                ", update_at=" + update_at +
                ", client_id=" + client_id +
                '}';
    }

}
