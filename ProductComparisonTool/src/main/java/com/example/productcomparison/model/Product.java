package com.example.productcomparison.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String platform;
    private String category;
    private double price;
    private double rating;
    private String features;
    
    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for platform
    public String getPlatform() {
        return platform;
    }

    // Setter for platform
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    // Getter for category
    public String getCategory() {
        return category;
    }

    // Setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for rating
    public double getRating() {
        return rating;
    }

    // Setter for rating
    public void setRating(double rating) {
        this.rating = rating;
    }

    // Getter for features
    public String getFeatures() {
        return features;
    }

    // Setter for features
    public void setFeatures(String features) {
        this.features = features;
    }
}

