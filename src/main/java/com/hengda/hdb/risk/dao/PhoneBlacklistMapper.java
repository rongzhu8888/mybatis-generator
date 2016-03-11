package com.hengda.hdb.risk.dao;

import com.hengda.hdb.risk.base.po.PhoneBlacklist;

public interface PhoneBlacklistMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PhoneBlacklist record);

    int insertSelective(PhoneBlacklist record);

    PhoneBlacklist selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PhoneBlacklist record);

    int updateByPrimaryKey(PhoneBlacklist record);
}