package com.zeogonal.solidshop.products.food;

import com.zeogonal.solidshop.products.Category;
import com.zeogonal.solidshop.products.Expirable;
import com.zeogonal.solidshop.products.Product;
import com.zeogonal.solidshop.products.Weighable;

import java.time.LocalDate;
import java.util.Objects;

public class Food extends Product implements Weighable, Expirable {
    protected final int weight; // Weight in grams
    /**
     * Expiration date of the product in the ISO-8601 calendar system, such as 2007-12-03.
     */
    protected final LocalDate expirationDate;

    public Food(String name, String description, int price, String id, String manufacturer, int weight, LocalDate expirationDate) {
        super(name, description, price, Category.FOOD, id, manufacturer);
        this.weight = weight;
        this.expirationDate = Objects.requireNonNull(expirationDate);
    }

    @Override
    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        return today.isAfter(expirationDate);
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food food)) return false;
        if (!super.equals(o)) return false;

        if (getWeight() != food.getWeight()) return false;
        return expirationDate.equals(food.expirationDate);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getWeight();
        result = 31 * result + expirationDate.hashCode();
        return result;
    }
}
