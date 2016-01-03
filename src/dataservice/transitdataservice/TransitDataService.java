package dataservice.transitdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.transitPO.TransitPO;

public interface TransitDataService extends Remote{
	public TransitPO findTransit(TransitPO tp) throws RemoteException;

	public void addTransit(TransitPO tp) throws RemoteException;

	public void changeTransit(TransitPO tp1, TransitPO tp2) throws RemoteException;

	public void removeTransit(TransitPO tp) throws RemoteException;

	public ArrayList<TransitPO> getTransitList() throws RemoteException;

}
