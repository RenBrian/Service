package dataservice.transitdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.transitPO.HallLoadPO;

public interface HallLoadDataService extends Remote{
	public HallLoadPO findHallLoad(HallLoadPO hp) throws RemoteException;

	public void addHallLoad(HallLoadPO hp) throws RemoteException;

	public void changeHallLoad(HallLoadPO hp1, HallLoadPO hp2) throws RemoteException;

	public void removeHallLoad(HallLoadPO hp) throws RemoteException;

	public ArrayList<HallLoadPO> getHallLoadList() throws RemoteException;

}
