package com.forestry.service.sys.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.forestry.core.service.BaseService;
import com.forestry.dao.sys.MonitorLogDao;
import com.forestry.model.sys.MonitorLog;
import com.forestry.service.sys.MonitorLogService;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
@Service
public class MonitorLogServiceImpl extends BaseService<MonitorLog> implements MonitorLogService {

	private MonitorLogDao monitorLogDao;

	@Resource
	public void setMonitorLogDao(MonitorLogDao monitorLogDao) {
		this.monitorLogDao = monitorLogDao;
		this.dao = monitorLogDao;
	}

	@Override
	public List<MonitorLog> querySensorMonitorLog() {
		return monitorLogDao.querySensorMonitorLog();
	}

}
