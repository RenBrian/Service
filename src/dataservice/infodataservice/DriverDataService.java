package dataservice.infodataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.infoPO.DriverPO;

public interface DriverDataService extends Remote{
	public DriverPO findDriver(DriverPO dp) throws RemoteException;

	public void addDriver(DriverPO dp) throws RemoteException;

	public void removeDriver(DriverPO dp) throws RemoteException;

	public void changeDriver(DriverPO dp1, DriverPO dp2) throws RemoteException;

	public ArrayList<DriverPO> getDricerList() throws RemoteException;

}
