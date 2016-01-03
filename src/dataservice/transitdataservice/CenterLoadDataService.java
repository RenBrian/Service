package dataservice.transitdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.transitPO.CenterLoadPO;

public interface CenterLoadDataService extends Remote{
	public CenterLoadPO findCenterLoad(CenterLoadPO cp) throws RemoteException;

	public void addCenterLoad(CenterLoadPO cp) throws RemoteException;

	public void changeCenterLoad(CenterLoadPO cp1, CenterLoadPO cp2) throws RemoteException;

	public void removeCenterLoad(CenterLoadPO cp) throws RemoteException;

	public ArrayList<CenterLoadPO> getCenterLoadList() throws RemoteException;

}
