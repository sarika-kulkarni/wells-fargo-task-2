package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;

@Entity
public class Portfolio {
    public Portfolio() {
    }

    public Portfolio(int portfolioId, Client client) {
        this.portfolioId = portfolioId;
        this.client = client;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "portfolio_id")
    private int portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Constructors, getters, and setters

    public int getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(int portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

