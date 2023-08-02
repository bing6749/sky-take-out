package com.sky.mapper;
/*
 * @author  MaRui
 * @date  2023/7/31 21:40
 * @version 1.0
 */

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {
    List<ShoppingCart> list(ShoppingCart shoppingCart);

    @Update("update shopping_cart set number = #{number} where id = #{id}")
    void updateNumberById(ShoppingCart cart);

    @Insert("insert into shopping_cart(name, image, user_id, dish_id, setmeal_id, dish_flavor,number, amount, create_time) " +
            "values (#{name},#{image},#{userId},#{dishId},#{setmealId},#{dishFlavor},#{number},#{amount},#{createTime}) ")
    void insert(ShoppingCart shoppingCart);


    @Delete("delete from shopping_cart where user_id = #{id}")
    void deleteByUserId(Long id);

    @Delete("delete from shopping_cart where id = #{id}")
    void deleteById(Long id);
}
