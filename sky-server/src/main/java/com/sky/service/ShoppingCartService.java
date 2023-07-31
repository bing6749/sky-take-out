package com.sky.service;
/*
 * @author  MaRui
 * @date  2023/7/31 21:32
 * @version 1.0
 */

import com.sky.dto.ShoppingCartDTO;

public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
