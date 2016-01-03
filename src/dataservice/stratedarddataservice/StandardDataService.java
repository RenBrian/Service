package dataservice.stratedarddataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.stratedardPO.StandardPO;

public interface StandardDataService extends Remote{
	public StandardPO findStandard(StandardPO sp) throws RemoteException;

	public void addStandard(StandardPO sp) throws RemoteException;

	public void changeStandard(StandardPO sp1, StandardPO sp2) throws RemoteException;

	public void removeStandard(StandardPO sp) throws RemoteException;

	public ArrayList<StandardPO> getStandardList() throws RemoteException;

}
