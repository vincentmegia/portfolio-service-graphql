package com.stupendousware.portfolio.models;

import java.math.BigInteger;

import lombok.Data;

@Data
public class Portfolio {
    private BigInteger id;
    private String name;
    private User user;

    public Portfolio(String name) {
        this.name = name;
    }

    public void createUser(String lastname, String firstname) {
        this.user = User.createUser(lastname, firstname);
    }

    public static Portfolio createPortfolio(String name) {
        Portfolio portfolio = new Portfolio(name);
        return portfolio;
    }
}
