package com.smartcommunity.cache;

import java.util.HashSet;
import java.util.Set;

import com.smartcommunity.mapper.ModulesMapper;
import com.smartcommunity.mapper.ResourcesMapper;
import com.smartcommunity.pojo.Modules;
import com.smartcommunity.pojo.Operations;
import com.smartcommunity.pojo.Resources;

public class ResourceCache {

	public static java.util.Map<Integer,java.util.List<Modules>> resourceMap = new java.util.HashMap<>();
	public static boolean isPermit(java.util.Set<Integer> roles,String url) {
	
		for (Integer roleid : roles) {
			java.util.List<Modules> modules = resourceMap.get(roleid);
			if (modules == null) {
				getResourceMap(roleid);
			}			
			modules = resourceMap.get(roleid);
			for (Modules module : modules) {
				java.util.List<Operations> operations = module.getOperations();
				if (operations == null)
						continue;
				for (Operations operation : operations) {
					if (operation.getAddress().equals(url) || (operation.getAddress() + ".action").equals(url)) {
						return true;
					}
				}
			}
		}
			return false;
	}

	/**
	 * 取得角色与资源的对应关系
	 */
	public synchronized  static void getResourceMap(Integer roleid) {
		if (resourceMap.get(roleid) != null) {
			return ;
		}
		org.springframework.context.ApplicationContext applicationContext = com.smartcommunity.listener.ApplicationListener.getApplicationContext();
		ModulesMapper modulesMapper = (ModulesMapper) applicationContext.getBean("modulesMapper");
		java.util.List<Modules> modules = modulesMapper.getModulesAndOperationsByRoleId(1);

//		java.util.Set<String> urlSet = new HashSet<String>();
//		for (Resources resource : resources) {
//
//			urlSet.add(resource.getUrl());
//		}
		resourceMap.put(roleid, modules);
		System.out.println("cache" + resourceMap.get(roleid));
	}
}
