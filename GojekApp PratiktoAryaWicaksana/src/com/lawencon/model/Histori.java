package com.lawencon.model;

import com.lawencon.constant.ServiceType;

public class Histori {
	
	private ServiceType ServiceType;
	private Integer TotalPrice;
	
	public void setServiceType(ServiceType ServiceType) {
		this.ServiceType = ServiceType;
	}
	
	public void setTotalPrice(Integer TotalPrice) {
		this.TotalPrice = TotalPrice;
	}
	
	public ServiceType getServiceType() {
		return this.ServiceType;
	}
	
	public Integer getTotalPrice() {
		return this.TotalPrice;
	}
	
}
