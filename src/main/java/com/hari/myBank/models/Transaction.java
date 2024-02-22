package com.hari.myBank.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Transaction {

    @Id
    @SequenceGenerator(name = "TransIDGen", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TransIDGen")
    int transactionID;
    @Column(nullable = false)
    int senderAccNo;
    @Column(nullable = false)
    int recipientAccNo;
    @Column(nullable = false)
    float amount;
    @Column(nullable = true)
    String remarks;

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getSenderAccNo() {
        return senderAccNo;
    }

    public void setSenderAccNo(int senderAccNo) {
        this.senderAccNo = senderAccNo;
    }

    public int getRecipientAccNo() {
        return recipientAccNo;
    }

    public void setRecipientAccNo(int recipientAccNo) {
        this.recipientAccNo = recipientAccNo;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Transaction [transactionID=" + transactionID + ", senderAccNo=" + senderAccNo + ", recipientAccNo="
                + recipientAccNo + ", amount=" + amount + ", remarks=" + remarks + "]";
    }

}
