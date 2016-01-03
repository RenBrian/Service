package data.expressdata.deliverydata;

import java.util.ArrayList;

import dataservice.expressdataservice.deliverydataservice.DeliveryDataService;
import po.expressPO.deliveryPO.DeliveryPO;

public class DeliveryData implements DeliveryDataService {
	public static DeliveryList dl = new DeliveryList();

	@Override
	public DeliveryPO findDelivery(DeliveryPO dp) {
		// TODO Auto-generated method stub
		return dl.getDeliveryPO(dp);
	}

	@Override
	public void addDelivery(DeliveryPO dp) {
		// TODO Auto-generated method stub
		dl.addDelivery(dp);

	}

	@Override
	public void changeDelivery(DeliveryPO dp1, DeliveryPO dp2) {
		// TODO Auto-generated method stub
		dl.changeDelivery(dp1, dp2);

	}

	@Override
	public void removeDelivery(DeliveryPO dp) {
		// TODO Auto-generated method stub
		dl.removeDelivery(dp);

	}

	@Override
	public ArrayList<DeliveryPO> getDeliveryList() {
		// TODO Auto-generated method stub
		ArrayList<DeliveryPO> a = dl.getDeliveryList();
		return a;
	}

}
