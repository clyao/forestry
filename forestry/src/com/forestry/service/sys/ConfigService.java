package com.forestry.service.sys;

import java.util.List;

import com.forestry.core.service.Service;
import com.forestry.model.sys.Config;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
public interface ConfigService extends Service<Config> {

	List<Config> getConfigList(List<Config> resultList);

}
