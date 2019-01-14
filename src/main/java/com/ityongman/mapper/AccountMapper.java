package com.ityongman.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.ityongman.model.AccountEO;
import com.ityongman.util.BaseMapper;


@Mapper
public interface AccountMapper extends BaseMapper<AccountEO> {

}
