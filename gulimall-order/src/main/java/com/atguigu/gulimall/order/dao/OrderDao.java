package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hh
 * @email 55333@qq.com
 * @date 2022-04-08 20:15:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
