package com.forestry.dao.sys;

import java.util.List;

import com.forestry.core.dao.Dao;
import com.forestry.model.sys.MonitorLog;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
public interface MonitorLogDao extends Dao<MonitorLog> {

	List<MonitorLog> querySensorMonitorLog();

}
