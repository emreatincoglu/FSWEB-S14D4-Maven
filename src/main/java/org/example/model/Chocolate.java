package org.example.model;

public class Chocolate extends ProductForSale{
    private String chocolateBrand;

    public String getChocolateBrand() {
        return chocolateBrand;
    }

    public void setChocolateBrand(String chocolateType) {
        this.chocolateBrand = chocolateType;
    }

    public Chocolate(String type, double price, String description ) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String chocolateBrand) {
        super(type, price, description);
        setChocolateBrand(chocolateBrand);
    }

    @Override
    public void showDetails() {
        System.out.println(getChocolateBrand() + " " + getType() + " " + getPrice() + " " + getDescription());
    }
}
