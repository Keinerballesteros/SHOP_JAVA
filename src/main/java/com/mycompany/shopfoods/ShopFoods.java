

package com.mycompany.shopfoods;


public class ShopFoods {

    public static void main(String[] args) {
        Shop shop = new Shop("Tienda", "Ocaña");
        Foods burguer = new Foods("Burguer", "Pan,Carne,etc", 9000);
        Foods pizza = new Foods("Pizza", "Harina, Piña, queso", 5000);
        shop.addFoods(pizza);
        shop.addFoods(burguer);
        Customers clientOne = new Customers("Keiner", 18);
        Customers clientTwo = new Customers("Maria", 15);
        clientOne.buy(pizza, 2);
        clientTwo.buy(burguer, 1);
        shop.listCustomers(clientOne);
        shop.listCustomers(clientTwo);
        shop.totalSale();
    }
}
