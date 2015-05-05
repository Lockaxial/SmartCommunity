package com.smartcommunity.service.impl;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.smartcommunity.pojo.Modules;
import com.smartcommunity.pojo.Operations;
import com.smartcommunity.pojo.RoleModuleOperation;
import com.smartcommunity.service.IAuthorityService;

public class AuthorityServiceImpl implements IAuthorityService{
	private com.smartcommunity.mapper.ModulesMapper modulesMapper;
	private com.smartcommunity.mapper.OperationsMapper operationsMapper;
	private com.smartcommunity.mapper.RoleMapper roleMapper;
	private com.smartcommunity.mapper.RoleModuleOperationMapper roleModuleOperationMapper;
	@Override
	public JSONObject getModules() {

		java.util.List<Modules> modules = modulesMapper.selectByExample(new com.smartcommunity.pojo.ModulesExample());
		
	//	java.util.List<Modules> modules = modulesMapper.getModulesAndOperationsByRoleId(1);
		
		com.alibaba.fastjson.JSONArray jsonArray = (JSONArray) com.alibaba.fastjson.JSON.toJSON(modules);
		JSONObject jsonObject = com.smartcommunity.util.JSONUtil.getJsonObject(true);
		com.smartcommunity.util.JSONUtil.putResult(jsonObject, jsonArray);
		return jsonObject;
	}

	@Override
	public JSONObject getOperations(Integer moduleId) {
		if (moduleId == null) 
			return null;
		com.smartcommunity.pojo.OperationsExample operationsExample = new com.smartcommunity.pojo.OperationsExample();
		operationsExample.or().andModuleidEqualTo(moduleId);
		java.util.List<Operations> operations = operationsMapper.selectByExample(operationsExample);
		JSONArray jsonArray = (JSONArray) com.alibaba.fastjson.JSON.toJSON(operations);
		JSONObject jsonObject = com.smartcommunity.util.JSONUtil.getJsonObject(true);
		com.smartcommunity.util.JSONUtil.putResult(jsonObject, jsonArray);
		return jsonObject;
	}

	@Override
	public JSONObject getModulesAndOperations() {
		java.util.List<Modules> modules = modulesMapper.getModulesAndOperations();
		JSONObject jsonObject = com.smartcommunity.util.JSONUtil.getJsonObject(true);
		com.smartcommunity.util.JSONUtil.putResult(jsonObject, (JSONArray) com.alibaba.fastjson.JSON.toJSON(modules));
		
		return jsonObject;
	}

	public com.smartcommunity.mapper.ModulesMapper getModulesMapper() {
		return modulesMapper;
	}

	public void setModulesMapper(com.smartcommunity.mapper.ModulesMapper modulesMapper) {
		this.modulesMapper = modulesMapper;
	}

	public com.smartcommunity.mapper.OperationsMapper getOperationsMapper() {
		return operationsMapper;
	}

	public void setOperationsMapper(com.smartcommunity.mapper.OperationsMapper operationsMapper) {
		this.operationsMapper = operationsMapper;
	}

	@org.springframework.transaction.annotation.Transactional
	@Override
	public JSONObject addModules(List<Modules> modules) {
		if (modules == null) {
			return com.smartcommunity.util.JSONUtil.getFalseJsonObject("没有要添加的模块");
		}
		for (Modules modules2 : modules) {
			modulesMapper.insertSelective(modules2);
			for (Operations operations : modules2.getOperations()) {
				operations.setModuleid(modules2.getId());
				operationsMapper.insertSelective(operations);
			}
		}
		return com.smartcommunity.util.JSONUtil.getJsonObject(true);
	}

	@Override
	public JSONObject deleteModule(Integer moduleId) {
		modulesMapper.deleteByPrimaryKey(moduleId);
		return com.smartcommunity.util.JSONUtil.getJsonObject(true);
	}

	@Override
	public JSONObject updateModule(Modules modules) {
		if (modules == null) {
			return com.smartcommunity.util.JSONUtil.getFalseJsonObject("没有要更新的内容");
		}
		modulesMapper.updateByPrimaryKeySelective(modules);
		return com.smartcommunity.util.JSONUtil.getJsonObject(true);
	}

	@Override
	public JSONObject deleteOperation(Integer operationsId) {
		operationsMapper.deleteByPrimaryKey(operationsId);
		return com.smartcommunity.util.JSONUtil.getJsonObject(true);
	}

	@Override
	public JSONObject updateOperation(Operations operations) {
		if (operations == null) {
			return com.smartcommunity.util.JSONUtil.getFalseJsonObject("没有要更新的内容");
		}
		operations.setModuleid(null);
		operationsMapper.updateByPrimaryKeySelective(operations);
		return com.smartcommunity.util.JSONUtil.getJsonObject(true);
	}

	public com.smartcommunity.mapper.RoleMapper getRoleMapper() {
		return roleMapper;
	}

	public void setRoleMapper(com.smartcommunity.mapper.RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}

	@org.springframework.transaction.annotation.Transactional
	@Override
	public JSONObject addRoles(List<com.smartcommunity.pojo.Role> roles) {
		if (roles == null || roles.size() < 1) {
			return com.smartcommunity.util.JSONUtil.getFalseJsonObject("没有要添加的角色");
		}
		for (com.smartcommunity.pojo.Role role : roles) {
			roleMapper.insertSelective(role);
		}
		return com.smartcommunity.util.JSONUtil.getJsonObject(true);
	}

	public com.smartcommunity.mapper.RoleModuleOperationMapper getRoleModuleOperationMapper() {
		return roleModuleOperationMapper;
	}

	public void setRoleModuleOperationMapper(
			com.smartcommunity.mapper.RoleModuleOperationMapper roleModuleOperationMapper) {
		this.roleModuleOperationMapper = roleModuleOperationMapper;
	}

	@org.springframework.transaction.annotation.Transactional
	@Override
	public JSONObject addAuthority(
			List<RoleModuleOperation> roleModuleOperations) {
		System.out.println("dkfj");
		if (roleModuleOperations == null || roleModuleOperations.size()< 1) {
			return com.smartcommunity.util.JSONUtil.getFalseJsonObject("没有要添加的信息");
		}
		for (RoleModuleOperation roleModuleOperation : roleModuleOperations) {
			roleModuleOperationMapper.insertSelective(roleModuleOperation);
		}
		return com.smartcommunity.util.JSONUtil.getJsonObject(true);
	}

}
