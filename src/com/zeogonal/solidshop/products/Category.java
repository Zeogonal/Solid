package com.zeogonal.solidshop.products;

public enum Category {
    CLOTHES("Одежда"),
    ELECTRONICS("Электроника"),
    BOOKS("Книги"),
    FOOD("Продукты питания"),
    OTHER("Другое");

    private final String name;

    Category() {
        this.name = this.name();
    }

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
