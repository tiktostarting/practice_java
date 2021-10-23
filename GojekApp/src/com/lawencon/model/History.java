package com.lawencon.model;

import com.lawencon.constant.ServiceType;

public class History {

	private ServiceType serviceType;
	private Integer totalPrice;
	
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}
	
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public ServiceType getServiceType() {
		return this.serviceType;
	}
	
	public Integer getTotalPrice() {
		return this.totalPrice;
	}
}
