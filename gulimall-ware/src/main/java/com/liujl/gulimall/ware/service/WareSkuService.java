package com.liujl.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujl.common.utils.PageUtils;
import com.liujl.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author liujl
 * @email liujl25@163.com
 * @date 2022-02-17 23:07:17
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

