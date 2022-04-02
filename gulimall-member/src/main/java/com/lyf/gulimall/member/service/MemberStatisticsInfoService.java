package com.lyf.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyf.common.utils.PageUtils;
import com.lyf.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author lyf
 * @email yufanlu98@outlook.com
 * @date 2022-04-02 00:20:21
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

