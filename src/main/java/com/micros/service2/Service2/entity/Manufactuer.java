package com.micros.service2.Service2.entity;

import javax.persistence.*;

@Entity
@Table(name="manu")
public class Manufactuer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manufacuterId;

    @Column(name = "manu_name")
    private String manufactuerName;

    @Column(name = "manu_address")
    private String manuAddress;

    @Column(name="product_id")
    private int productId;



    public Manufactuer() {
    }


    public Manufactuer(int manufacuterId, String manufactuerName, String manuAddress, int productId) {
        this.manufacuterId = manufacuterId;
        this.manufactuerName = manufactuerName;
        this.manuAddress = manuAddress;
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getManufacuterId() {
        return manufacuterId;
    }

    public void setManufacuterId(int manufacuterId) {
        this.manufacuterId = manufacuterId;
    }

    public String getManufactuerName() {
        return manufactuerName;
    }

    public void setManufactuerName(String manufactuerName) {
        this.manufactuerName = manufactuerName;
    }

    public String getManuAddress() {
        return manuAddress;
    }

    public void setManuAddress(String manuAddress) {
        this.manuAddress = manuAddress;
    }
}
