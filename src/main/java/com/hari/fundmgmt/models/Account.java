package com.hari.fundmgmt.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Account {

    @Id
    @SequenceGenerator(name = "AccNoGen", initialValue = 101, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AccNoGen")
    int accNo;
    @Column(nullable = false)
    float balance;
    @Column(nullable = false)
    String accHolderName;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    @Override
    public String toString() {
        return "Account [accNo=" + accNo + ", balance=" + balance + ", accHolderName=" + accHolderName + "]";
    }

}
