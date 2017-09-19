package com.zhiyou100.ssm.vo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2925490664070037741L;
	
	private Integer userId;// 用户ID
	private String username;// 姓名
	private String password;// 密码
	private Boolean isAdmin;// 是否管理员
	private Boolean isSystem;// 是否为系统内置（不能删除）
	private Integer departmentId;// 部门ID
	private Integer roleId;// 角色ID
	private Boolean isMale;// 性别
	private String mobile;// 手机
	private String address;// 地址
	private Integer age;// 年龄
	private String tel;// 座机
	private String idNum;// 身份证
	private String email;// E_mail
	private String qq;// QQ
	private String hobby;// 爱好
	private Integer education;// 学历
	private String cardNum;// 工资卡号
	private String nation;// 民族
	private Integer marry;// 婚姻状况
	private Integer status;// 用户状态
	private String remark;// 操作备注
	private Date createTime;// 添加时间
	private Integer creater;// 添加人
	private Date updateTime;// 修改时间
	private Integer updater;// 修改人

	public User() {
	}

	
	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean getIsAdmin() {
		return isAdmin;
	}


	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}


	public Boolean getIsSystem() {
		return isSystem;
	}


	public void setIsSystem(Boolean isSystem) {
		this.isSystem = isSystem;
	}


	public Integer getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}


	public Integer getRoleId() {
		return roleId;
	}


	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}


	public Boolean getIsMale() {
		return isMale;
	}


	public void setIsMale(Boolean isMale) {
		this.isMale = isMale;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getIdNum() {
		return idNum;
	}


	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getQq() {
		return qq;
	}


	public void setQq(String qq) {
		this.qq = qq;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	public Integer getEducation() {
		return education;
	}


	public void setEducation(Integer education) {
		this.education = education;
	}


	public String getCardNum() {
		return cardNum;
	}


	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}


	public String getNation() {
		return nation;
	}


	public void setNation(String nation) {
		this.nation = nation;
	}


	public Integer getMarry() {
		return marry;
	}


	public void setMarry(Integer marry) {
		this.marry = marry;
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


	public Date getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public Integer getCreater() {
		return creater;
	}


	public void setCreater(Integer creater) {
		this.creater = creater;
	}


	public Date getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(Date updateTime) {
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
		return "用户 [用户Id=" + userId + ", 姓名=" + username + ", 密码=" + password + ", 是否是管理员=" + isAdmin
				+ ", 是否为系统内置=" + isSystem + ", 部门Id=" + departmentId + ", 角色Id=" + roleId + ", 性别="
				+ isMale + ", 手机=" + mobile + ", 地址=" + address + ", 年龄=" + age + ", 座机=" + tel + ", 身份证="
				+ idNum + ", 邮箱=" + email + ", QQ=" + qq + ", 爱好=" + hobby + ", 学历=" + education
				+ ", 工资卡号=" + cardNum + ", 民族=" + nation + ", 婚姻状况=" + marry + ", 用户状态=" + status
				+ ", 备注=" + remark + ", 添加时间=" + createTime + ", 添加人=" + creater + ", 修改时间="
				+ updateTime + ", 修改人=" + updater + "]";
	}
	
	
}
