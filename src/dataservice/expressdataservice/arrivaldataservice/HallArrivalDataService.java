package dataservice.expressdataservice.arrivaldataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.expressPO.arrivalPO.HallArrivalPO;

public interface HallArrivalDataService extends Remote{
	public HallArrivalPO findHallArrival(HallArrivalPO hp) throws RemoteException;

	public void addHallArrival(HallArrivalPO hp) throws RemoteException;

	public void changeHallArrival(HallArrivalPO hp1, HallArrivalPO hp2) throws RemoteException;

	public void removeHallArrival(HallArrivalPO hp) throws RemoteException;

	public ArrayList<HallArrivalPO> getHallArrivalList() throws RemoteException;

}
