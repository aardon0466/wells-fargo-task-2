package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.text.DateFormat;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    private Portfolio portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private DateFormat purchaseDate;

    @Column(nullable = false)
    private float quantity;

    protected Security() {

    }

    public Security(DateFormat purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Portfolio portfolioId) {this.portfolioId = portfolioId;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getPurchasePrice() {return purchasePrice;}

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public DateFormat getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(DateFormat purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}