package com.agung.springformwizard.entity;

import java.io.Serializable;

/**
 *
 * @author Agung Setiawan
 */
public class Customer implements Serializable{
    private String name;
    private String email;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
