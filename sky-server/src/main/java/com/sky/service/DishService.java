package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * @author 木杉
 * @date 2025/3/29
 */
public interface DishService {

    /**
     * 保存菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
