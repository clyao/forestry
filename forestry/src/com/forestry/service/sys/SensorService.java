package com.forestry.service.sys;

import java.util.List;

import com.forestry.core.service.Service;
import com.forestry.core.support.QueryResult;
import com.forestry.model.sys.Sensor;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
public interface SensorService extends Service<Sensor> {

	List<Sensor> querySensorBySensorType(Short sensorType);

	List<Sensor> querySensorLastData();

	QueryResult<Sensor> querySensorList(Sensor sensor);

	List<Sensor> querySensorLastDataWithEpcId();

	List<Sensor> queryForestrySensorLastData();

}
