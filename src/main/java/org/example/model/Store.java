package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale bread = new Bread("Test",10, "Test Bread", 450);
        ProductForSale chocolate = new Chocolate("Test", 10, "Test Chocolate", "square");
        ProductForSale coke = new Coke("Test", 10, "Test Coke", 250 );


        ProductForSale[] products = {bread, chocolate, coke};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
        }
    }
}