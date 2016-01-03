package dataservice.expressdataservice.arrivaldataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.expressPO.arrivalPO.CenterArrivalPO;

public interface CenterArrivalDataService extends Remote{
	public CenterArrivalPO findCenterArrival(CenterArrivalPO cp) throws RemoteException;

	public void addCenterArrival(CenterArrivalPO cp) throws RemoteException;

	public void changeCenterArrival(CenterArrivalPO cp1, CenterArrivalPO cp2) throws RemoteException;

	public void removeCenterArrival(CenterArrivalPO cp) throws RemoteException;

	public ArrayList<CenterArrivalPO> getCenterArrivalList() throws RemoteException;

}
