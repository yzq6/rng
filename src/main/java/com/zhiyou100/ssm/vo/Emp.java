package com.zhiyou100.ssm.vo;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer empno;
	private Integer deptno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	private Integer mgr;
	private Date hiredate;
	private Date createTime;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", deptno=" + deptno + ", ename=" + ename + ", job=" + job + ", sal=" + sal
				+ ", comm=" + comm + ", mgr=" + mgr + ", hiredate=" + hiredate + ", createTime=" + createTime + "]";
	}
	
	

}
