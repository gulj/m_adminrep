package com.gu.service.permission;

import java.util.HashMap;
import java.util.List;

import com.gu.bean.Permission;
import com.gu.bean.Params;

/**
 * 
 * IPermissionService
 * 创建人:gulj 
 * 时间：2015年12月21日 22:22:04
 * @version 1.0.0
 * 
 */
public interface IPermissionService {


	/**
	 * 
	 * com.gu.service.permission 
	 * 方法名：findPermissions
	 * 创建人：gulj 
	 * 手机号码:15295059075
	 * 时间：2015年12月21日 22:22:04
	 * @param params
	 * @return 
	 * 返回类型：List<Permission>
	 * @exception 
	 * @since  1.0.0
	 */
	public HashMap<String,Object> findPermissions(Params params);
	
	/**
	 * 求总数
	 * com.gu.dao.permission 
	 * 方法名：count
	 * 创建人：gulj 
	 * 手机号码:15295059075
	 * 时间：2015年12月21日 22:22:04
	 * @param id
	 * @return 
	 * 返回类型：List<Permission>
	 * @exception 
	 * @since  1.0.0
	 */
	public int count(Params params);
	
	/**
	 * 
	 * com.gu.service.permission 
	 * 方法名：findPermissions
	 * 创建人：gulj 
	 * 手机号码:15295059075
	 * 时间：2015年12月21日 22:22:04
	 * @param params
	 * @return 
	 * 返回类型：List<Permission>
	 * @exception 
	 * @since  1.0.0
	 */
	public Permission get(Integer id);
	
	/**
	 * 保存用户管理
	 * com.gu.service.permission 
	 * 方法名：save
	 * 创建人：gulj 
	 * 手机号码:15295059075
	 * 时间：2015年12月21日 22:22:04 
	 * @param permission
	 * @return 
	 * 返回类型：Permission
	 * @exception 
	 * @since  1.0.0
	 */
	public int save(Permission permission);
	
	/**
	 * 更新用户管理
	 * com.gu.service.permission 
	 * 方法名：update
	 * 创建人：gulj 
	 * 手机号码:15295059075
	 * 时间：2015年12月21日 22:22:04
	 * @param permission
	 * @return 
	 * 返回类型：int
	 * @exception 
	 * @since  1.0.0
	 */
	public int update(Permission permission);
	
	/**
	 * 删除用户管理
	 * com.gu.service.permission 
	 * 方法名：delete
	 * 创建人：gulj 
	 * 手机号码:15295059075
	 * 时间：2015年12月21日 22:22:04
	 * @param params
	 * @return 
	 * 返回类型：int
	 * @exception 
	 * @since  1.0.0
	 */
	public int delete(Params params);
}
