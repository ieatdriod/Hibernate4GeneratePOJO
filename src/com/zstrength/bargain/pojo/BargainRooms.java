package com.zstrength.bargain.pojo;

// Generated Jun 24, 2015 4:56:54 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * BargainRooms generated by hbm2java
 */
public class BargainRooms implements java.io.Serializable {

	private Integer roomId;
	private int objectId;
	private String sellerId;
	private boolean sellerType;
	private String buyerId;
	private boolean buyerType;
	private int buyerStatus;
	private Date createdDatetime;
	private Date updatedDatetime;

	public BargainRooms() {
	}

	public BargainRooms(int objectId, String sellerId, boolean sellerType,
			String buyerId, boolean buyerType, int buyerStatus,
			Date createdDatetime) {
		this.objectId = objectId;
		this.sellerId = sellerId;
		this.sellerType = sellerType;
		this.buyerId = buyerId;
		this.buyerType = buyerType;
		this.buyerStatus = buyerStatus;
		this.createdDatetime = createdDatetime;
	}

	public BargainRooms(int objectId, String sellerId, boolean sellerType,
			String buyerId, boolean buyerType, int buyerStatus,
			Date createdDatetime, Date updatedDatetime) {
		this.objectId = objectId;
		this.sellerId = sellerId;
		this.sellerType = sellerType;
		this.buyerId = buyerId;
		this.buyerType = buyerType;
		this.buyerStatus = buyerStatus;
		this.createdDatetime = createdDatetime;
		this.updatedDatetime = updatedDatetime;
	}

	public Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public int getObjectId() {
		return this.objectId;
	}

	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	public String getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public boolean isSellerType() {
		return this.sellerType;
	}

	public void setSellerType(boolean sellerType) {
		this.sellerType = sellerType;
	}

	public String getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public boolean isBuyerType() {
		return this.buyerType;
	}

	public void setBuyerType(boolean buyerType) {
		this.buyerType = buyerType;
	}

	public int getBuyerStatus() {
		return this.buyerStatus;
	}

	public void setBuyerStatus(int buyerStatus) {
		this.buyerStatus = buyerStatus;
	}

	public Date getCreatedDatetime() {
		return this.createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Date getUpdatedDatetime() {
		return this.updatedDatetime;
	}

	public void setUpdatedDatetime(Date updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}

}
