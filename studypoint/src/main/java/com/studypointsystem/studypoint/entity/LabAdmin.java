package com.studypointsystem.studypoint.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "labadmins")
public class LabAdmin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int labAdminId;
	
	@Column
	private String labAdminName;
	@Column
	private String labAdminEmailId;
	@Column
	private String labAdminMobileNo;
	public int getLabAdminId() {
		return labAdminId;
	}
	public void setLabAdminId(int labAdminId) {
		this.labAdminId = labAdminId;
	}
	public String getLabAdminName() {
		return labAdminName;
	}
	public void setLabAdminName(String labAdminName) {
		this.labAdminName = labAdminName;
	}
	public String getLabAdminEmailId() {
		return labAdminEmailId;
	}
	public void setLabAdminEmailId(String labAdminEmailId) {
		this.labAdminEmailId = labAdminEmailId;
	}
	public String getLabAdminMobileNo() {
		return labAdminMobileNo;
	}
	public void setLabAdminMobileNo(String labAdminMobileNo) {
		this.labAdminMobileNo = labAdminMobileNo;
	}
	
	public LabAdmin() {
	//	super();
	}
	public LabAdmin(int labAdminId, String labAdminName, String labAdminEmailId, String labAdminMobileNo) {
	//	super();
		this.labAdminId = labAdminId;
		this.labAdminName = labAdminName;
		this.labAdminEmailId = labAdminEmailId;
		this.labAdminMobileNo = labAdminMobileNo;
	}
	@Override
	public String toString() {
		return "LabAdmin [labAdminId=" + labAdminId + ", labAdminName=" + labAdminName + ", labAdminEmailId="
				+ labAdminEmailId + ", labAdminMobileNo=" + labAdminMobileNo + "]";
	}
}
