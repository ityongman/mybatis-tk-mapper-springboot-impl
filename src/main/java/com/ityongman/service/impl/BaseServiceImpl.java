package com.ityongman.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ityongman.service.IBaseService;
import com.ityongman.util.BaseMapper;

public class BaseServiceImpl<T> implements IBaseService<T>{
	@Autowired
	private BaseMapper<T> mapper ;
	
	@Override
	public T selectByKey(Object key) {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public int save(T entity) {
		return mapper.insert(entity);
	}

	@Override
	public int delete(Object key) {
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int updateAll(T entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	@Override
	public int updateNotNull(T entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public List<T> selectByExample(Object example) {
		return mapper.selectByExample(example);
	}
}
