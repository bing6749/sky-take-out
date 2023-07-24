package com.sky.controller.admin;
/*
 * @author  MaRui
 * @date  2023/7/24 14:30
 * @version 1.0
 */


import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.DishService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author MaRui
 */
@RestController
@RequestMapping("/admin/dish")
@Api(value = "菜品相关接口")
@Slf4j
public class DishController {

    @Autowired
    private DishService dishService;

    @PostMapping("")
    @ApiOperation("新增菜品")
    public Result save(@RequestBody DishDTO dishDTO) {
        dishService.saveWithFlavor(dishDTO);
        return Result.success();
    }

    @GetMapping("/page")
    @ApiOperation("菜品分页查询")
    public Result<PageResult> page(DishPageQueryDTO dishPageQueryDTO) {
        PageResult pageResult = dishService.pageQuery(dishPageQueryDTO);
        return Result.success(pageResult);
    }

    @DeleteMapping("")
    @ApiOperation("菜品的批量删除")
    public Result delete(@RequestParam List<Long> ids) {
        dishService.deleteDatch(ids);
        return Result.success();
    }
}
