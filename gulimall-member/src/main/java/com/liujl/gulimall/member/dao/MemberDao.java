package com.liujl.gulimall.member.dao;

import com.liujl.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liujl
 * @email liujl25@163.com
 * @date 2022-02-15 22:35:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
