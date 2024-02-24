package com.zeogonal.solidshop.products;

import java.util.Objects;

public abstract class Product {

    private final Category category;
    private final String id;
    private final String manufacturer;
    private String name;
    private String description;
    private int price;


    protected Product(String name, String description, int price, Category category, String id, String manufacturer) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = Objects.requireNonNull(category);
        this.id = Objects.requireNonNull(id);
        this.manufacturer = Objects.requireNonNull(manufacturer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (price != product.price) return false;
        if (!Objects.equals(name, product.name)) return false;
        if (!Objects.equals(description, product.description))
            return false;
        if (category != product.category) return false;
        if (!id.equals(product.id)) return false;
        return Objects.equals(manufacturer, product.manufacturer);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + category.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + manufacturer.hashCode();
        return result;
    }

    void setDescription(String description) {
        this.description = description;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setName(String name) {
        this.name = name;
    }


}
