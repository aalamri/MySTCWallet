package com.demo.MySTCWallet.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long walletID;
    public String walletName;
    public String currencyType;
    public Long balance;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    public Wallet() {

    }

    public Wallet(Long walletID){
        super();
        this.walletID = walletID;
    }

    public Wallet(Long walletID,String walletName, String currencyType, Long balance) {
        super();
        this.walletID = walletID;
        this.currencyType = currencyType;
        this.balance = balance;
        this.walletName = walletName;
    }

    public Long getwalletID() {
        return walletID;
    }

    public void setwalletID(Long walletID) {
        this.walletID = walletID;
    }

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

}
