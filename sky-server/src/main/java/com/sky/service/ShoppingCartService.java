package com.sky.service;
/*
 * @author  MaRui
 * @date  2023/7/31 21:32
 * @version 1.0
 */

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    List<ShoppingCart> list();

    void cleanShoppingCart();

    void sub(ShoppingCartDTO shoppingCartDTO);
}
