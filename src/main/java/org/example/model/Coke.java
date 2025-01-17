package org.example.model;

public class Coke extends ProductForSale {
    int bottleSize;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, int bottleSize) {
        super(type, price, description);
        this.bottleSize = bottleSize;
    }

    public int getBottleSize() {
        return bottleSize;
    }

    @Override
    public void showDetails(){
        System.out.println("Type: " + getType() +
                ", Price: " + getPrice()  +
                ", Description: " + getDescription()+
                ", Bottle Size: " + getBottleSize() + " ml");
    }



}
