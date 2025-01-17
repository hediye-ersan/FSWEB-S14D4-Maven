package org.example.model;

public class Chocolate extends ProductForSale{
    private String shape;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String shape) {
        super(type, price, description);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public void showDetails(){
        System.out.println("Type: " + getType() +
                ", Price: " + getPrice()  +
                ", Description: " + getDescription()+
                ", Shape: " + getShape());
    }


}
