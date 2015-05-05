package com.smartcommunity.service;

import com.alibaba.fastjson.JSONObject;
import com.smartcommunity.pojo.Modules;

public interface IAuthorityService {

	public JSONObject getModules();
	public JSONObject getOperations(Integer moduleId);
	public JSONObject getModulesAndOperations();
	/** 添加模块与操作 */
	public JSONObject addModules(java.util.List<Modules> modules);

	/** 删除模块  */
	public JSONObject deleteModule(Integer moduleId);

	/** 修改模块 */
	public JSONObject updateModule(Modules modules);
	/** 删除操作 */
	public JSONObject deleteOperation(Integer operationsId);

	/** 修改操作 */
	public JSONObject updateOperation(com.smartcommunity.pojo.Operations operations);
	public JSONObject addRoles(java.util.List<com.smartcommunity.pojo.Role> role) ;
	public JSONObject addAuthority(java.util.List<com.smartcommunity.pojo.RoleModuleOperation> roleModuleOperations);
}
