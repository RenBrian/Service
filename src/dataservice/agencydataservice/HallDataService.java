package dataservice.agencydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.agencyPO.HallPO;

public interface HallDataService extends Remote{
	public HallPO findHall(HallPO hp) throws RemoteException;

	public void addHall(HallPO hp) throws RemoteException;

	public void changeHall(HallPO hp1, HallPO hp2) throws RemoteException;

	public void removeHall(HallPO hp) throws RemoteException;

	public ArrayList<HallPO> getHallList() throws RemoteException;

}
