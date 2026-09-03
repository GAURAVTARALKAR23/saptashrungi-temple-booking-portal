package com.templeapp.backend.entity;

public enum TicketType {
    VIP(500),
    VVIP(1000),
    SPECIAL(2000);

    private final int price;

    TicketType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
