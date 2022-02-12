package com.techelevator.view;

import java.math.BigDecimal;

public class Item {
    private String slot;
    private int quantity = 5;
    private String name;
    private BigDecimal price = BigDecimal.ZERO;
    String sound;


    public Item(String slot, int quantity, String name, BigDecimal price, String sound) {
        this.slot = slot;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.sound = sound;
    }

    public Item() {
    }


    public String getSlot() {
        return slot;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public  String getSound() {
        return sound;
    }

    public void dispense() {
        quantity -= 1;
    }

}
