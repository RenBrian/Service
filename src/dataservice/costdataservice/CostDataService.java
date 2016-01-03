package dataservice.costdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.costPO.CostPO;

public interface CostDataService extends Remote{
	public CostPO findCost(CostPO cp) throws RemoteException;

	public void addCost(CostPO cp) throws RemoteException;

	public void changeCost(CostPO cp1, CostPO cp2) throws RemoteException;

	public void removeCost(CostPO cp) throws RemoteException;

	public ArrayList<CostPO> getCostList() throws RemoteException;

}
