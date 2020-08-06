package org.dxc.royalCourier.model;

import org.springframework.beans.factory.annotation.Value;

public class Courier {

	
	private int courierId;
	private int weight;
	private ServiceChargeInfo serviceCharge;
	private float chargePerkg;
	@Value("${chargePerKg}")
	public int getCourierId() {
		return courierId;
	}
	public void setCourierId(int courierId) {
		this.courierId = courierId;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public ServiceChargeInfo getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(ServiceChargeInfo serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public float getChargePerkg() {
		return chargePerkg;
	}
	public void setChargePerkg(float chargePerkg) {
		this.chargePerkg = chargePerkg;
	}
	
}




