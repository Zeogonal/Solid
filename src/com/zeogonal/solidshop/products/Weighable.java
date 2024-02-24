package com.zeogonal.solidshop.products;

@FunctionalInterface
public interface Weighable {

    /**
     * Returns the weight of the product in grams.
     *
     * @return the weight of the product in grams
     */
    int getWeight();
}
