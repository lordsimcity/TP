package com.company;
import java.util.*;

public class Item {
    public final String name;
    public final long price;

    public Item(String name, long price) {
        this.name = name;
        this.price = price;
        System.out.println(getName() + " : " + String.format("%d.%02d", getPrice(), 0) + '€');
    }

    public String getName() {
        return this.name;
    }

    public long getPrice() {
        return this.price;
    }

}