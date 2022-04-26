package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hh
 * @email 55333@qq.com
 * @date 2022-04-08 20:10:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
