package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Security {
    public Security() {
    }

    public Security(int securityId, String name, String category, Date purchaseDate, BigDecimal purchasePrice, int quantity, Portfolio portfolio) {
        this.securityId = securityId;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_id")
    private int securityId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Category")
    private String category;

    @Column(name = "PurchaseDate", nullable = false)
    private Date purchaseDate;

    @Column(name = "PurchasePrice", nullable = false, precision = 10, scale = 2)
    private BigDecimal purchasePrice;

    @Column(name = "Quantity", nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    // Constructors, getters, and setters

    public int getSecurityId() {
        return securityId;
    }

    public void setSecurityId(int securityId) {
        this.securityId = securityId;
    }

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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
