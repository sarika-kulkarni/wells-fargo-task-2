package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Client {
    public Client() {
    }

    public Client(int clientId, String name, String contactDetails, FinancialAdvisor advisor) {
        this.clientId = clientId;
        this.name = name;
        this.contactDetails = contactDetails;
        this.advisor = advisor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private int clientId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "ContactDetails")
    private String contactDetails;

    @ManyToOne
    @JoinColumn(name = "AdvisorID")
    private FinancialAdvisor advisor;

    // Constructors, getters, and setters

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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

    public FinancialAdvisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(FinancialAdvisor advisor) {
        this.advisor = advisor;
    }
}
