package com.sky.service;
/*
 * @author  MaRui
 * @date  2023/8/1 20:08
 * @version 1.0
 */

import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;

public interface OrderService {
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);
}
