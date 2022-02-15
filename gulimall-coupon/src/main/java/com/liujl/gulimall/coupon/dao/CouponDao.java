package com.liujl.gulimall.coupon.dao;

import com.liujl.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author liujl
 * @email liujl25@163.com
 * @date 2022-02-15 21:45:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
