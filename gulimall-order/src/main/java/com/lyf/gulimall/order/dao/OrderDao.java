package com.lyf.gulimall.order.dao;

import com.lyf.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lyf
 * @email yufanlu98@outlook.com
 * @date 2022-04-02 00:29:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
