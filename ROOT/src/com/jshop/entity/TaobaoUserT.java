package com.jshop.entity;

// Generated 2012-6-12 9:51:48 by Hibernate Tools 3.4.0.CR1

/**
 * TaobaoUserT generated by hbm2java
 */
public class TaobaoUserT implements java.io.Serializable {

	private String taobaoUserid;
	private String taobaoNick;

	public TaobaoUserT() {
	}

	public TaobaoUserT(String taobaoUserid, String taobaoNick) {
		this.taobaoUserid = taobaoUserid;
		this.taobaoNick = taobaoNick;
	}

	public String getTaobaoUserid() {
		return this.taobaoUserid;
	}

	public void setTaobaoUserid(String taobaoUserid) {
		this.taobaoUserid = taobaoUserid;
	}

	public String getTaobaoNick() {
		return this.taobaoNick;
	}

	public void setTaobaoNick(String taobaoNick) {
		this.taobaoNick = taobaoNick;
	}

}
