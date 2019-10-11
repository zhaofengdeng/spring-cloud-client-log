package com.project.model;


import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.ebean.Ebean;
import io.ebean.annotation.DbComment;
import io.ebean.annotation.Index;

@Entity
@DbComment("操作日志")
@Table(name = "tbl_log_operation")
public class LogOperation {
	
	@Column(name = "id")
	@DbComment("主键ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "open_id")
	@Index
	public String openId;

	@Column(name = "user_phone")
	@Index
	public String userPhone;

	@Column(name = "user_id")
	@Index
	public String userId;
	
	@Column(name = "ip_address")
	@Index
	@DbComment("ip地址")
    public String ipAddress;
	
	@Column(name = "project_name")
	@Index
	@DbComment("项目名称")
	public String projectName;
	
	@Column(name = "page_name")
	@Index
	@DbComment("页面名称")
	public String pageName;
	
	@Column(name = "operation")
	@Index
	@DbComment("操作、动作")
    public String operation;

	@Column(name = "label")
	@Index
	@DbComment("标签")
    public String label;
	
	@Column(name = "remark")
	public String remark;
	
	@Column(name = "remark1")
	public String remark1;
	
	@Column(name = "remark2")
	public String remark2;
	
	@Column(name = "remark3")
	public String remark3;
	
	@Column(name = "remark4")
	public String remark4;
	
	@Column(name = "remark5")
	public String remark5;
	
	@Column(name = "remark6")
	public String remark6;
	
	@Column(name = "remark7")
	public String remark7;
	
	@Column(name = "remark8")
	public String remark8;
	
	@Column(name = "remark9")
	public String remark9;
	
	@Column(name = "inserted_at")
	public Date insertedAt;

	public void save() {
		this.setInsertedAt(new Date());
		Ebean.save(this);
	}
	
	public void update() {
		Ebean.update(this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	public String getRemark4() {
		return remark4;
	}

	public void setRemark4(String remark4) {
		this.remark4 = remark4;
	}

	public String getRemark5() {
		return remark5;
	}

	public void setRemark5(String remark5) {
		this.remark5 = remark5;
	}

	public String getRemark6() {
		return remark6;
	}

	public void setRemark6(String remark6) {
		this.remark6 = remark6;
	}

	public String getRemark7() {
		return remark7;
	}

	public void setRemark7(String remark7) {
		this.remark7 = remark7;
	}

	public String getRemark8() {
		return remark8;
	}

	public void setRemark8(String remark8) {
		this.remark8 = remark8;
	}

	public String getRemark9() {
		return remark9;
	}

	public void setRemark9(String remark9) {
		this.remark9 = remark9;
	}

	public Date getInsertedAt() {
		return insertedAt;
	}

	public void setInsertedAt(Date insertedAt) {
		this.insertedAt = insertedAt;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	
	
}
