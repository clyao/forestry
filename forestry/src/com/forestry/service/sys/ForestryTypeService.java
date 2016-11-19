package com.forestry.service.sys;

import java.util.List;

import com.forestry.core.service.Service;
import com.forestry.model.sys.ForestryType;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
public interface ForestryTypeService extends Service<ForestryType> {

	List<ForestryType> getForestryTypeList(List<ForestryType> resultList);

}
