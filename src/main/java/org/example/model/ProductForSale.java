package org.example.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String Description;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ProductForSale(String type, double price, String description) {
        setType(type);
        setPrice(price);
        setDescription(description);
    }

    public double getSalesPrice(int quantity) {
        return quantity*price;
    }

    public abstract void showDetails();

}
