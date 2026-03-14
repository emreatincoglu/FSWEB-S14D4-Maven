package org.example.model;

public class Bread extends ProductForSale{
    private String breadType;

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public Bread(String type, double price, String description ) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, String breadType) {
        super(type, price, description);
        setBreadType(breadType);
    }

    @Override
    public void showDetails() {
        System.out.println(getBreadType() + " " + getType() + " " + getPrice() + " " + getDescription());
    }
}
