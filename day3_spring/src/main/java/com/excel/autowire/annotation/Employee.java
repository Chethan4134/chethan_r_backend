package com.excel.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
// 	this is another way instead using setter in employee class
	@Qualifier("address1")
//	or address
	private Address address;

//	public Address getAddress() {
//		return address;
//	}

//	public void setAddress(Address address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Employee {address->" + address + "}";
	}

//	public Employee(Address address) {
//		super();
//		this.address = address;
//	}
//	
}
