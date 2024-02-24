package com.zeogonal.solidshop.cart;

import com.zeogonal.solidshop.products.Product;

import java.util.List;

/**
 * Базовый интерфейс для корзины
 */
public interface ShoppingCart {
    /**
     * Добавление товара в корзину
     */
    void addProduct(Product product);

    /**
     * Удаление товара из корзины
     */
    void removeProduct(Product product);

    /**
     * Получение списка товаров в корзине
     */
    List<Product> getProducts();

    /**
     * Очистка корзины
     */
    void clearCart();

    /**
     * Получение количества товаров в корзине
     */
    int getNumberOfProducts();
}
