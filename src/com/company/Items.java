package com.company;

class Item {
    private String name;
    private int price;
    private int amount;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toMenu() {
        return "Item {" +
                "název='" + name + '\'' +
                ", cena=" + price +
                '}';
    }

    @Override
    public String toString() {
        return "Item {" +
                "název='" + name + '\'' +
                ", cena=" + price +
                ", množství=" + amount +
                '}';
    }
}
