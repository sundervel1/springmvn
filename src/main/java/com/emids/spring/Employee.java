package com.emids.spring;

import java.util.List;

public class Employee {
	private int empId;
	private String fName;
	private String lName;
	private Address address;
	List<Address> addrList;
	
	public List<Address> getAddrList() {
		return addrList;
	}
	public void setAddrList(List<Address> addrList) {
		this.addrList = addrList;
	}
	public Employee() {
		System.out.println("emp constr");
	}
	public Employee(int empId, String fName, String lName, Address address) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}
	public void init() {
		System.out.println("init emp called");
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", address=" + address
				+ ", addrList=" + addrList + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
