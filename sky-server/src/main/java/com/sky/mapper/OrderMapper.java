package com.sky.mapper;
/*
 * @author  MaRui
 * @date  2023/8/1 20:17
 * @version 1.0
 */

import com.sky.entity.OrderDetail;
import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    void insert(Orders orders);

}
