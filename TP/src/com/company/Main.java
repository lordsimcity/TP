package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Item item1 = new Item("corn flakes", 500);
        Item item2 = new Item("caviar", 50000);
        Item item3 = new Item("water", 101);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

    }
}
