package com.example.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.security.Timestamp;
import java.util.Objects;
import java.util.UUID;
@Entity
@Table(name = "managers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Manager {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "lust_name")
    private String lust_name;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "update_at")
    private Timestamp update_at;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;
        return Objects.equals(getId(), manager.getId()) && Objects.equals(getFirst_name(), manager.getFirst_name()) && Objects.equals(getLust_name(), manager.getLust_name()) && Objects.equals(getStatus(), manager.getStatus()) && Objects.equals(getCreated_at(), manager.getCreated_at()) && Objects.equals(getUpdate_at(), manager.getUpdate_at());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirst_name(), getLust_name(), getStatus(), getCreated_at(), getUpdate_at());
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", lust_name='" + lust_name + '\'' +
                ", status='" + status + '\'' +
                ", created_at=" + created_at +
                ", update_at=" + update_at +
                '}';
    }
}
