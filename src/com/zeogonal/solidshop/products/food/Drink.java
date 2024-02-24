package com.zeogonal.solidshop.products.food;

import java.time.LocalDate;

public class Drink extends Food implements Liquids {


    /**
     * Volume of drink in milliliters.
     */
    private final int volume;

    public Drink(String name, String description, int price, String id, String manufacturer, int weight, LocalDate expirationDate, int volume) {
        super(name, description, price, id, manufacturer, weight, expirationDate);
        this.volume = volume;
    }


    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drink drink)) return false;
        if (!super.equals(o)) return false;

        return getVolume() == drink.getVolume();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getVolume();
        return result;
    }
}
