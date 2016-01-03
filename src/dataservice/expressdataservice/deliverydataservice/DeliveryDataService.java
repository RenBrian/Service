package dataservice.expressdataservice.deliverydataservice;

import java.util.ArrayList;

import po.expressPO.deliveryPO.DeliveryPO;

public interface DeliveryDataService {
	public DeliveryPO findDelivery(DeliveryPO dp);

	public void addDelivery(DeliveryPO dp);

	public void changeDelivery(DeliveryPO dp1, DeliveryPO dp2);

	public void removeDelivery(DeliveryPO dp);

	public ArrayList<DeliveryPO> getDeliveryList();
}
