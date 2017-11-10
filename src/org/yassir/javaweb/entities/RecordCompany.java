package org.yassir.javaweb.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Table(name = "record_companies")
public class RecordCompany implements Serializable
{
    public RecordCompany() {
    }

    public RecordCompany(String name, String address, String details) {
        this.name = name;
        this.address = address;
        this.details = details;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String details;

    @Override
    public String toString() {
        return "RecordCompany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
