package dataservice.expressdataservice.deliverydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.expressPO.deliveryPO.DeliveryPO;

public interface DeliveryDataService extends Remote{
	public DeliveryPO findDelivery(DeliveryPO dp) throws RemoteException;

	public void addDelivery(DeliveryPO dp) throws RemoteException;

	public void changeDelivery(DeliveryPO dp1, DeliveryPO dp2) throws RemoteException;

	public void removeDelivery(DeliveryPO dp) throws RemoteException;

	public ArrayList<DeliveryPO> getDeliveryList() throws RemoteException;
}
