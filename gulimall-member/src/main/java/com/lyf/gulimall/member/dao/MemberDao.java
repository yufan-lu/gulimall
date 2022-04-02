package com.lyf.gulimall.member.dao;

import com.lyf.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lyf
 * @email yufanlu98@outlook.com
 * @date 2022-04-02 00:20:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
