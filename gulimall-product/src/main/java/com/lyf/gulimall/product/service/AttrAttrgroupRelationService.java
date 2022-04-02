package com.lyf.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyf.common.utils.PageUtils;
import com.lyf.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author lyf
 * @email yufanlu98@outlook.com
 * @date 2022-03-24 02:16:10
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

