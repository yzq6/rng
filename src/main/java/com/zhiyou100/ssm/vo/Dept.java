package com.zhiyou100.ssm.vo;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class Dept implements Serializable {
	private Integer deptId; // 	 部门ID  	主键 自动增长 自增初始值4	
	private String 	deptName;	// 部门名称 	默认值 NULL	
	private String	deptDesc;	//部门描述 	默认值 NULL	
	private Integer status;		//部门状态	默认值：2 正常：2 已删除：-2	
	private String 	remark;		//操作备注	NULL	
	private Timestamp 	createTime;	//添加时间	默认值 CURRENT_TIMESTAMP	
	private Integer creater;	//添加人	默认值 NULL	
	private Timestamp 	updateTime;	//修改时间	默认值 '0000-00-00 00:00:00'	
	private Integer updater;	//修改人	默认值 NULL	
	
	public Dept() {
		super();
	}

	
	public Integer getDeptId() {
		return deptId;
	}


	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getDeptDesc() {
		return deptDesc;
	}


	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Timestamp getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}


	public Integer getCreater() {
		return creater;
	}


	public void setCreater(Integer creater) {
		this.creater = creater;
	}


	public Timestamp getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}


	public Integer getUpdater() {
		return updater;
	}


	public void setUpdater(Integer updater) {
		this.updater = updater;
	}


	@Override
	public String toString() {
		return "部门信息 [部门编号=" + deptId + ", 部门名称=" + deptName
				+ ", 部门描述=" + deptDesc + ", 部门状态=" + status + ", 操作备注k=" + remark
				+ ", 创建时间=" + createTime + ", 创建人=" + creater + ", 修改时间=" + updateTime
				+ ", 修改人=" + updater + "]";
	}



}
