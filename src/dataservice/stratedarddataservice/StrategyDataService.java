package dataservice.stratedarddataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.stratedardPO.StrategyPO;

public interface StrategyDataService extends Remote{
	public StrategyPO findStrategy(StrategyPO sp) throws RemoteException;

	public void addStrategy(StrategyPO sp) throws RemoteException;

	public void changeStrategy(StrategyPO sp1, StrategyPO sp2) throws RemoteException;

	public void removeStrategy(StrategyPO sp) throws RemoteException;

	public ArrayList<StrategyPO> getStrategyList() throws RemoteException;

}
