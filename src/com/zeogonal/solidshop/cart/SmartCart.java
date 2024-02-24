package com.zeogonal.solidshop.cart;

import com.zeogonal.solidshop.products.Product;

import java.util.List;

/**
 * Умная корзина. Реализован принцип Open/Closed. Класс должен быть открыт для расширения, но закрыт
 * для модификации. Наследуется от простой корзины. Добавлена логика проверки товаров.
 */
public class SmartCart extends SimpleCart {

  @Override
  public void addProduct(Product product) {
    if (product != null) {
      super.addProduct(product);
    }
  }

  @Override
  public void removeProduct(Product product) {

    if (product != null && getProducts().contains(product)) {
      super.removeProduct(product);
    }
  }

  @Override
  public List<Product> getProducts() {
    return super.getProducts();
  }

  @Override
  public void clearCart() {

    if (getNumberOfProducts() > 0) {
      super.clearCart();
    }
  }

  @Override
  public int getNumberOfProducts() {
    if (getProducts() != null) {
      return super.getNumberOfProducts();
    } else {
      return 0;
    }
  }
}
