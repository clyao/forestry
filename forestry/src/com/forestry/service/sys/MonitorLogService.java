package com.forestry.service.sys;

import java.util.List;

import com.forestry.core.service.Service;
import com.forestry.model.sys.MonitorLog;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
public interface MonitorLogService extends Service<MonitorLog> {

	List<MonitorLog> querySensorMonitorLog();

}
