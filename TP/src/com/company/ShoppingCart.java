package com.company;
import java.util.*;

public class ShoppingCart {

     List<Item> items;
     int articles;
     int id;

    public void addItem(List<Item> item) {
        this.items = item;
    }

    public int itemCount(){
    return items.size();

        }

    public void removeItem (Item item){
        items.remove(item);
    }

    public int getId() {
        return this.id;
    }

}
