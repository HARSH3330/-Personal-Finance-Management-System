package com.example.FinanceManager.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    private Long userId;
    private String transactionType;
    private double amount;
    private String category;
    private Date date;
    private String notes;

    public Transaction() {}

    public Transaction(Long userId, String transactionType, double amount, String category, Date date, String notes) {
        this.userId = userId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.notes = notes;
    }

    // Getters and Setters
    public Long getTransactionId() { return transactionId; }
    public void setTransactionId(Long transactionId) { this.transactionId = transactionId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}
