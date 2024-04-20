package com.stupendousware.portfolio.models;

import java.math.BigInteger;

import lombok.Data;

@Data
public class User {
    private BigInteger id;
    private String lastname;
    private String firtname;

    public User(String lastname, String firstname) {
        this.lastname = lastname;
        this.firtname = firstname;
    }

    public static User createUser(String lastname, String firstname) {
        return new User(lastname, firstname);
    }
}
