
package com.mycompany.shopfoods;


public class Customers {
    
    private String name;
    private int age;
    private double totalBuy;

    public Customers(String name, int age) {
        this.name = name;
        this.age = age;
        this.totalBuy = 0;
    }
    
    public void buy(Foods food, int amount){
     totalBuy += food.getPrice() * amount;
        System.out.println("El total de su compra es: "+ totalBuy);
    }

    public double getTotalBuy() {
        return totalBuy;
    }
    
    
}
