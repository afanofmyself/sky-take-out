package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 木杉
 * @date 2025/3/31
 */
@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询套餐id
     * @param dishId
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishId);
}
