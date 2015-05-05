package com.smartcommunity.action;

import com.smartcommunity.pojo.Modules;

public class AuthorityParams {

	private Integer id;
	private java.util.List<Modules> modules;
	private Modules module;
	private com.smartcommunity.pojo.Operations operation;
	private java.util.List<com.smartcommunity.pojo.Role> roles;
	private java.util.List<com.smartcommunity.pojo.RoleModuleOperation> roleModuleOperations;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public java.util.List<Modules> getModules() {
		return modules;
	}

	public void setModules(java.util.List<Modules> modules) {
		this.modules = modules;
	}


	public Modules getModule() {
		return module;
	}

	public void setModule(Modules module) {
		this.module = module;
	}

	public com.smartcommunity.pojo.Operations getOperation() {
		return operation;
	}

	public void setOperation(com.smartcommunity.pojo.Operations operation) {
		this.operation = operation;
	}

	public java.util.List<com.smartcommunity.pojo.Role> getRoles() {
		return roles;
	}

	public void setRoles(java.util.List<com.smartcommunity.pojo.Role> roles) {
		this.roles = roles;
	}

	public java.util.List<com.smartcommunity.pojo.RoleModuleOperation> getRoleModuleOperations() {
		return roleModuleOperations;
	}

	public void setRoleModuleOperations(java.util.List<com.smartcommunity.pojo.RoleModuleOperation> roleModuleOperations) {
		this.roleModuleOperations = roleModuleOperations;
	}
}
