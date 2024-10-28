package com.vhuthu.spaza.service.cart;

import com.vhuthu.spaza.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
    Cart getcart(Long id);
    void  clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Long initializeNewCart();
}