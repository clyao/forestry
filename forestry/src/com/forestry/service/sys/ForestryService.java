package com.forestry.service.sys;

import java.util.List;

import com.forestry.core.service.Service;
import com.forestry.model.sys.Forestry;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
public interface ForestryService extends Service<Forestry> {

	List<Forestry> getForestryList(List<Forestry> resultList);
	
	List<Object[]> queryExportedForestry(Long[] ids);

}
