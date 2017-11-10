package org.yassir.javaweb.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity @Table(name = "record_companies")
public class RecordCompany implements Serializable
{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String details;

    // bidirectional One to many,  this is parent
    @OneToMany(cascade=CascadeType.ALL, mappedBy="recordCompany")
    private List<CD> cdList;

    @Override
    public String toString() {
        return "RecordCompany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", details='" + details + '\'' +
                ", cdList=" + cdList +
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

    public List<CD> getCdList() {
        return cdList;
    }

    public void setCdList(List<CD> cdList) {
        this.cdList = cdList;
    }

    public RecordCompany(String name, String address, String details, List<CD> cdList) {

        this.name = name;
        this.address = address;
        this.details = details;
        this.cdList = cdList;
    }    public RecordCompany(String name, String address, String details) {

        this.name = name;
        this.address = address;
        this.details = details;
    }

    public RecordCompany() {

    }
}
