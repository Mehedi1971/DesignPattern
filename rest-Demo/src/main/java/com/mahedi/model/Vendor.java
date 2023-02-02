package com.mahedi.model;

public class Vendor {
	private String id;
	private  String name;
	private String address;
	private String phoneNum;
	public Vendor() {
		super();
	}
	public Vendor(String id, String name, String address, String phoneNum) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", address=" + address + ", phoneNum=" + phoneNum + "]";
	}
	
}
