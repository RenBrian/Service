package dataservice.agencydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.agencyPO.CenterPO;

public interface CenterDataService extends Remote{
	public CenterPO findCenter(CenterPO cp) throws RemoteException;

	public void addCenter(CenterPO cp) throws RemoteException;

	public void changeCenter(CenterPO cp1, CenterPO cp2) throws RemoteException;

	public void removeCenter(CenterPO cp) throws RemoteException;

	public ArrayList<CenterPO> getCenterList() throws RemoteException;

}
