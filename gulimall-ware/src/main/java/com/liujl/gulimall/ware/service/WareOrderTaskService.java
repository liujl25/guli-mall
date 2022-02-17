package com.liujl.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujl.common.utils.PageUtils;
import com.liujl.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author liujl
 * @email liujl25@163.com
 * @date 2022-02-17 23:07:17
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

