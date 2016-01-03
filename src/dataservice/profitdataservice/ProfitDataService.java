package dataservice.profitdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.profitPO.ProfitPO;

public interface ProfitDataService extends Remote{
	public ProfitPO findProfit(ProfitPO pp) throws RemoteException;

	public void addProfit(ProfitPO pp) throws RemoteException;

	public void changeProfit(ProfitPO pp1, ProfitPO pp2) throws RemoteException;

	public void removeProfit(ProfitPO pp) throws RemoteException;

	public ArrayList<ProfitPO> getProfitList() throws RemoteException;

}
