package com.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import io.ebean.Ebean;
import io.ebean.annotation.DbComment;
import io.ebean.annotation.Index;


@Entity
@Table(name = "tbl_error_log")
public class LogError{
	@Column(name = "id")
	@DbComment("主键ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@DbComment("错误等级:1-10")
	public Integer level;
	
	@Column(name = "type")
	@DbComment("错误类")
	public String type;
	
	@Column(name = "project_name")
	@Index
	@DbComment("项目名称")
	public String projectName;
	
	@Column(name = "msg")
	@Lob
	public String msg;
	
	@Column(name = "inserted_at")
	public Date insertedAt;

	public void save() {
		this.setInsertedAt(new Date());
		Ebean.save(this);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getInsertedAt() {
		return insertedAt;
	}

	public void setInsertedAt(Date insertedAt) {
		this.insertedAt = insertedAt;
	}

	


	
	
}
