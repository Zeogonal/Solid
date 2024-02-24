package com.zeogonal.solidshop.cart;

import com.zeogonal.solidshop.products.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Single responsibility principle Корзина выполняет только одну задачу - хранит список товаров.
 * Корзина не знает как они будут отображаться на экране. Стоимость корзины определяется отдельной
 * логикой. Класс очень упрощен и не производит никаких проверок на корректность данных. Так же в
 * целях упрощения все методы публичные.
 */
public class SimpleCart implements ShoppingCart {
    private final List<Product> products;

    public SimpleCart() {
        products = new ArrayList<>();
    }

    /**
     * Добавление товара в корзину
     */
    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Удаление товара из корзины
     */
    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }

    /**
     * Получение списка товаров в корзине
     */
    @Override
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Очистка корзины
     */
    @Override
    public void clearCart() {
        products.clear();
    }

    /**
     * Получение количества товаров в корзине
     */
    @Override
    public int getNumberOfProducts() {
        return products.size();
    }
}
