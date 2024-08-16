
package com.mycompany.shopfoods;

import java.util.ArrayList;


public class Shop {
    private String name;
    private String place;
    private ArrayList<Foods> listFoods;
    private ArrayList<Customers> listCustomers;
    private double total;
    
    public Shop(String name, String place) {
        this.name = name;
        this.place = place;
        this.listFoods = new ArrayList<>();
        this.listCustomers = new ArrayList<>();
        this.total = 0;
    }
    
    public void addFoods(Foods food){
        listFoods.add(food);
    }
    
    public void listCustomers(Customers customer){
        listCustomers.add(customer);
        
    }
    public void totalSale(){
        for(Customers customer: listCustomers){
           total +=  customer.getTotalBuy();
        }
        System.out.println("Total de la venta del día: "+total);
    }
}
