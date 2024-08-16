
package com.mycompany.shopfoods;


public class Foods {
    private String name;
    private String ingredients;
    private double price;

    public Foods(String name, String ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    
}
