package com.paladin.wzd.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BaseDao extends SqlSessionDaoSupport{
	
	protected String getSpaceName(){
		return this.getClass().getInterfaces()[0].getSimpleName();
	}
	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	
	@SuppressWarnings("unchecked")
	public <T> List<T> query4List(String sql,Object param){
		return (List<T>)getSqlSession().selectList(getSpaceName() + "." + sql, param);
	}
	
	public void insert(String sql, Object param){
		getSqlSession().insert(getSpaceName() + "." + sql, param);
	}
}
