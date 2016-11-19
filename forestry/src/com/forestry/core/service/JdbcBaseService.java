package com.forestry.core.service;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.forestry.core.dao.JdbcBaseDao;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
@Transactional
public class JdbcBaseService {

	@Resource
	protected JdbcBaseDao jdbcBaseDao;

}
