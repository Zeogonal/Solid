package com.zeogonal.solidshop.products;


@FunctionalInterface
public interface Expirable {

    /**
     * Checks if the product is expired.
     *
     * @return true if the product is expired, false otherwise
     */
    boolean isExpired();
}
