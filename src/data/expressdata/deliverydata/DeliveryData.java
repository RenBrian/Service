package data.expressdata.deliverydata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.expressdataservice.deliverydataservice.DeliveryDataService;
import po.expressPO.deliveryPO.DeliveryPO;

@SuppressWarnings("serial")
public class DeliveryData extends UnicastRemoteObject implements DeliveryDataService {
	public DeliveryData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

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
