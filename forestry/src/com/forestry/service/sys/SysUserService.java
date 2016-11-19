package com.forestry.service.sys;

import java.util.List;

import com.forestry.core.service.Service;
import com.forestry.model.sys.SysUser;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
public interface SysUserService extends Service<SysUser> {

	List<SysUser> getSysUserList(List<SysUser> resultList);

}
