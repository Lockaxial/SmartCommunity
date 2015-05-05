package com.smartcommunity.action;

import com.alibaba.fastjson.JSONObject;
import com.smartcommunity.pojo.Modules;

public class AuthorityAction extends BaseActionSupport<AuthorityParams> {

	private com.smartcommunity.service.IAuthorityService authorityService;
	public String getModules() {
		com.alibaba.fastjson.JSONObject jsonObject = authorityService.getModules();

		return setJSONObject(jsonObject);
	}
	public String getOperations() {
		com.alibaba.fastjson.JSONObject jsonObject = authorityService.getOperations(parameters.getId());

		return setJSONObject(jsonObject);
	}
	public String addModules() {
		JSONObject jsonObject = authorityService.addModules(parameters.getModules());
		return setJSONObject(jsonObject);
	}
	public String getModulesAndOperations() {
		com.alibaba.fastjson.JSONObject jsonObject = authorityService.getModulesAndOperations();
		return setJSONObject(jsonObject);
	}
	public com.smartcommunity.service.IAuthorityService getAuthorityService() {
		return authorityService;
	}
	public void setAuthorityService(com.smartcommunity.service.IAuthorityService authorityService) {
		this.authorityService = authorityService;
	}

	/** 删除模块  */
	public String deleteModule( ) {
		return setJSONObject(authorityService.deleteModule(parameters.getId()));
	}

	/** 修改模块 */
	public String updateModule(){
		return setJSONObject(authorityService.updateModule(parameters.getModule()));
	}
	/** 删除操作 */
	public String deleteOperation(){
		return setJSONObject(authorityService.deleteOperation(parameters.getId()));
	}

	/** 修改操作 */
	public String updateOperation(){
		return setJSONObject(authorityService.updateOperation(parameters.getOperation()) );
	}
	/** 修改操作 */
	public String addRoles(){
		System.out.println("add roles");
		return setJSONObject(authorityService.addRoles(parameters.getRoles()) );
	}
	public String addAuthority(){
		return setJSONObject(authorityService.addAuthority(parameters.getRoleModuleOperations()) );
	}
}
