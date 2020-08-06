package org.dxc.royalCourier.BO;

import java.util.Map;

import java.util.Set;

import org.dxc.royalCourier.model.Courier;
import org.dxc.royalCourier.model.ServiceChargeInfo;

public class CourierBO {

	public double calculateCourierCharge(Courier cObj, String city) {

		float courierCharge = cObj.getWeight() * cObj.getChargePerkg();
		for (Map.Entry<String, Float> entry : cObj.getServiceCharge().getLocationServicecharge().entrySet()) {
			if (entry.getKey().equals(city)) {
				courierCharge = cObj.getWeight() * cObj.getChargePerkg();
				courierCharge = courierCharge + entry.getValue();
				break;

			}

		}
		return courierCharge;

	}
}



