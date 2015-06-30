package com.zstrength.obj.pojo;

// Generated Jun 30, 2015 3:36:43 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ObjSpherePhotos generated by hbm2java
 */
public class ObjSpherePhotos implements java.io.Serializable {

	private Integer sphId;
	private int refId;
	private int refType;
	private String partType;
	private String saveType;
	private String seqs;
	private String fileName;
	private String panoUrl;
	private String panoId;
	private String description;
	private Date createdDatetime;
	private Date updatedDatetime;
	private String remark;
	private Boolean published;

	public ObjSpherePhotos() {
	}

	public ObjSpherePhotos(int refId, int refType, String partType,
			String saveType, String seqs, String panoId, Date createdDatetime,
			Date updatedDatetime) {
		this.refId = refId;
		this.refType = refType;
		this.partType = partType;
		this.saveType = saveType;
		this.seqs = seqs;
		this.panoId = panoId;
		this.createdDatetime = createdDatetime;
		this.updatedDatetime = updatedDatetime;
	}

	public ObjSpherePhotos(int refId, int refType, String partType,
			String saveType, String seqs, String fileName, String panoUrl,
			String panoId, String description, Date createdDatetime,
			Date updatedDatetime, String remark, Boolean published) {
		this.refId = refId;
		this.refType = refType;
		this.partType = partType;
		this.saveType = saveType;
		this.seqs = seqs;
		this.fileName = fileName;
		this.panoUrl = panoUrl;
		this.panoId = panoId;
		this.description = description;
		this.createdDatetime = createdDatetime;
		this.updatedDatetime = updatedDatetime;
		this.remark = remark;
		this.published = published;
	}

	public Integer getSphId() {
		return this.sphId;
	}

	public void setSphId(Integer sphId) {
		this.sphId = sphId;
	}

	public int getRefId() {
		return this.refId;
	}

	public void setRefId(int refId) {
		this.refId = refId;
	}

	public int getRefType() {
		return this.refType;
	}

	public void setRefType(int refType) {
		this.refType = refType;
	}

	public String getPartType() {
		return this.partType;
	}

	public void setPartType(String partType) {
		this.partType = partType;
	}

	public String getSaveType() {
		return this.saveType;
	}

	public void setSaveType(String saveType) {
		this.saveType = saveType;
	}

	public String getSeqs() {
		return this.seqs;
	}

	public void setSeqs(String seqs) {
		this.seqs = seqs;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getPanoUrl() {
		return this.panoUrl;
	}

	public void setPanoUrl(String panoUrl) {
		this.panoUrl = panoUrl;
	}

	public String getPanoId() {
		return this.panoId;
	}

	public void setPanoId(String panoId) {
		this.panoId = panoId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Boolean getPublished() {
		return this.published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
	}

}
