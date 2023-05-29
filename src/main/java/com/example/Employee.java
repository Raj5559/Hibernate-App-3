package com.example;

import java.sql.Timestamp;

public class Employee {
	
	private int eid;
	private String ename;
	private String ecity;
	
	private Timestamp ts;
	
	

	public Timestamp getTs() {
		return ts;
	}

	public void setTs(Timestamp ts) {
		this.ts = ts;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	public Employee() {
		
	}


	public Employee(int eid, String ename, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
	}
	
	public Employee(String ename, String ecity) {
		super();
		this.ename = ename;
		this.ecity = ecity;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEcity() {
		return ecity;
	}


	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	
	

}
