package com.liujl.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujl.common.utils.PageUtils;
import com.liujl.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author liujl
 * @email liujl25@163.com
 * @date 2022-02-17 23:07:17
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

