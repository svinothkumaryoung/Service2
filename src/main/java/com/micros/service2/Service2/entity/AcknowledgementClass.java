package com.micros.service2.Service2.entity;

public class AcknowledgementClass {

    private Manufactuer manufactuer;
    private Product product;

    public AcknowledgementClass() {
    }

    public AcknowledgementClass(Manufactuer manufactuer, Product product) {
        this.manufactuer = manufactuer;
        this.product = product;
    }

    public Manufactuer getManufactuer() {
        return manufactuer;
    }

    public void setManufactuer(Manufactuer manufactuer) {
        this.manufactuer = manufactuer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
