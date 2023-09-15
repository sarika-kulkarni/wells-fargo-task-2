package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
@Entity
public class FinancialAdvisor {
    public FinancialAdvisor() {
    }

    public FinancialAdvisor(int advisorId, String name, String contactDetails, String username, String password) {
        this.advisorId = advisorId;
        this.name = name;
        this.contactDetails = contactDetails;
        this.username = username;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "advisor_id")
    private int advisorId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "ContactDetails")
    private String contactDetails;

    @Column(name = "Username", nullable = false, unique = true)
    private String username;

    @Column(name = "Password", nullable = false)
    private String password;

    // Constructors, getters, and setters

    public int getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(int advisorId) {
        this.advisorId = advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
