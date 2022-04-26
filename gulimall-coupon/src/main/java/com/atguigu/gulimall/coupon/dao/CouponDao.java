package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ${author}
 * @email 1552562031@qq.com
 * @date 2022-04-08 20:03:37
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
