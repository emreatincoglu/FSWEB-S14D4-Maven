package org.example.model;

public class Coke extends ProductForSale{
    private String cokeBrand;

    public String getCokeBrand() {
        return cokeBrand;
    }

    public void setCokeBrand(String cokeBrand) {
        this.cokeBrand = cokeBrand;
    }

    public Coke(String type, double price, String description, String cokeBrand) {
        super(type, price, description);
        setCokeBrand(cokeBrand);
    }

    public Coke(String type, double price, String description ) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getCokeBrand() + " " + getType() + " " + getPrice() + " " + getDescription());
    }
}
