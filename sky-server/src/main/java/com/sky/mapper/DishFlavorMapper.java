package com.sky.mapper;
/*
 * @author  MaRui
 * @date  2023/7/24 15:02
 * @version 1.0
 */


import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author MaRui
 */
@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入口味数据
     *
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);


    @Delete("delete dish_flavor where id = #{dishId}")
    void deleteById(Long dishId);
}
