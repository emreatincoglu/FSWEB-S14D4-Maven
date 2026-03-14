package org.example.model;

public class Store {
    public static void main(String[] args) {
     ProductForSale[] products = new ProductForSale[3];
     products[0] = new Bread("Pide", 40, "Yumurtali", "Ramazan Pidesi");
     products[1] = new Chocolate("Sutlu Cikolata", 50, "Katki maddesi bulunmaktadir", "Tobleron");
     products[2] = new Coke("Diet", 15, "Seker icermez", "Pepsi");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }

    }
}