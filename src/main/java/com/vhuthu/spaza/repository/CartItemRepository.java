package com.vhuthu.spaza.repository;

import com.vhuthu.spaza.model.Cart;
import com.vhuthu.spaza.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
  void deleteAllByCartId(Cart cart);
}