package com.jshop.entity;

// Generated 2012-6-17 19:20:06 by Hibernate Tools 3.4.0.CR1

/**
 * RoleFunctionM generated by hbm2java
 */
public class RoleFunctionM implements java.io.Serializable {

	private String id;
	private String roleid;
	private String functionid;

	public RoleFunctionM() {
	}

	public RoleFunctionM(String id, String roleid, String functionid) {
		this.id = id;
		this.roleid = roleid;
		this.functionid = functionid;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getFunctionid() {
		return this.functionid;
	}

	public void setFunctionid(String functionid) {
		this.functionid = functionid;
	}

}
