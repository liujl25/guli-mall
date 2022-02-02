package com.liujl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujl.common.utils.PageUtils;
import com.liujl.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author liujl
 * @email liujl25@163.com
 * @date 2022-01-10 21:34:39
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

