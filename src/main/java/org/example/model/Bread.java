package org.example.model;

import javax.sound.midi.Soundbank;

public class Bread extends ProductForSale{
    private int weight;

    public Bread(String type, double price, String description, int weight) {
        super(type, price, description);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public void showDetails(){
         System.out.println("Type: " + getType() +
                 ", Price: " + getPrice() +
                 ", Description: " + getDescription() +
                 ", Weight: " + getWeight() + " grams");
     }

}
