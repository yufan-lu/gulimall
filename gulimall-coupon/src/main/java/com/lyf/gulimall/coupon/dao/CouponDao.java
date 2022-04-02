package com.lyf.gulimall.coupon.dao;

import com.lyf.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lyf
 * @email yufanlu98@outlook.com
 * @date 2022-04-02 00:08:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
