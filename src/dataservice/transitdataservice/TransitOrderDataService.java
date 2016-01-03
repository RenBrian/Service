package dataservice.transitdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.transitPO.TransitOrderPO;

public interface TransitOrderDataService extends Remote{
	public TransitOrderPO findTransitOrder(TransitOrderPO tp) throws RemoteException;

	public void addTransitOrder(TransitOrderPO tp) throws RemoteException;

	public void changeTransitOrder(TransitOrderPO tp1, TransitOrderPO tp2) throws RemoteException;

	public void removeTransitOrder(TransitOrderPO tp) throws RemoteException;

	public ArrayList<TransitOrderPO> getTransitOrderList() throws RemoteException;
}
