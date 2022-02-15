package com.liujl.gulimall.order.dao;

import com.liujl.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liujl
 * @email liujl25@163.com
 * @date 2022-02-15 22:53:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
