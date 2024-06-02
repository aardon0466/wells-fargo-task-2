package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.text.DateFormat;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client clientId;

    @Column(nullable = false)
    private DateFormat date;

    protected Portfolio() {

    }

    public Portfolio(DateFormat date) {
        this.date = date;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {this.clientId = clientId;}

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }
}