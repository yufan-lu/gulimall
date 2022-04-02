package com.lyf.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyf.common.utils.PageUtils;
import com.lyf.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author lyf
 * @email yufanlu98@outlook.com
 * @date 2022-04-02 00:29:14
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

