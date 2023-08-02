package com.sky.mapper;
/*
 * @author  MaRui
 * @date  2023/8/1 20:19
 * @version 1.0
 */

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    void insertBatch(List<OrderDetail> orderDetailList);
}
