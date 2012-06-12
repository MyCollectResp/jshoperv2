package com.jshop.entity;

// Generated 2012-6-12 9:51:48 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * GoodsGroupT generated by hbm2java
 */
public class GoodsGroupT implements java.io.Serializable {

	private String groupid;
	private String goodsid;
	private String goodsname;
	private String state;
	private Date begintime;
	private Date endtime;
	private String creatorid;
	private Date createtime;
	private String cashstate;
	private Double cashlimit;
	private int limitbuy;
	private int salequantity;
	private int SOrderCount;
	private int totalOrderCount;
	private double sendpoint;
	private String priceladder;
	private String detail;
	private String pictureurl;

	public GoodsGroupT() {
	}

	public GoodsGroupT(String groupid, String goodsid, String goodsname,
			String state, Date begintime, Date endtime, String creatorid,
			Date createtime, String cashstate, int limitbuy, int salequantity,
			int SOrderCount, int totalOrderCount, double sendpoint,
			String detail, String pictureurl) {
		this.groupid = groupid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.state = state;
		this.begintime = begintime;
		this.endtime = endtime;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.cashstate = cashstate;
		this.limitbuy = limitbuy;
		this.salequantity = salequantity;
		this.SOrderCount = SOrderCount;
		this.totalOrderCount = totalOrderCount;
		this.sendpoint = sendpoint;
		this.detail = detail;
		this.pictureurl = pictureurl;
	}

	public GoodsGroupT(String groupid, String goodsid, String goodsname,
			String state, Date begintime, Date endtime, String creatorid,
			Date createtime, String cashstate, Double cashlimit, int limitbuy,
			int salequantity, int SOrderCount, int totalOrderCount,
			double sendpoint, String priceladder, String detail,
			String pictureurl) {
		this.groupid = groupid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.state = state;
		this.begintime = begintime;
		this.endtime = endtime;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.cashstate = cashstate;
		this.cashlimit = cashlimit;
		this.limitbuy = limitbuy;
		this.salequantity = salequantity;
		this.SOrderCount = SOrderCount;
		this.totalOrderCount = totalOrderCount;
		this.sendpoint = sendpoint;
		this.priceladder = priceladder;
		this.detail = detail;
		this.pictureurl = pictureurl;
	}

	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getBegintime() {
		return this.begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCashstate() {
		return this.cashstate;
	}

	public void setCashstate(String cashstate) {
		this.cashstate = cashstate;
	}

	public Double getCashlimit() {
		return this.cashlimit;
	}

	public void setCashlimit(Double cashlimit) {
		this.cashlimit = cashlimit;
	}

	public int getLimitbuy() {
		return this.limitbuy;
	}

	public void setLimitbuy(int limitbuy) {
		this.limitbuy = limitbuy;
	}

	public int getSalequantity() {
		return this.salequantity;
	}

	public void setSalequantity(int salequantity) {
		this.salequantity = salequantity;
	}

	public int getSOrderCount() {
		return this.SOrderCount;
	}

	public void setSOrderCount(int SOrderCount) {
		this.SOrderCount = SOrderCount;
	}

	public int getTotalOrderCount() {
		return this.totalOrderCount;
	}

	public void setTotalOrderCount(int totalOrderCount) {
		this.totalOrderCount = totalOrderCount;
	}

	public double getSendpoint() {
		return this.sendpoint;
	}

	public void setSendpoint(double sendpoint) {
		this.sendpoint = sendpoint;
	}

	public String getPriceladder() {
		return this.priceladder;
	}

	public void setPriceladder(String priceladder) {
		this.priceladder = priceladder;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPictureurl() {
		return this.pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}

}
