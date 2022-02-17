package com.liujl.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujl.common.utils.PageUtils;
import com.liujl.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author liujl
 * @email liujl25@163.com
 * @date 2022-02-17 23:07:17
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

