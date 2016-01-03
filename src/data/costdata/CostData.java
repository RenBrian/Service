package data.costdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.costdataservice.CostDataService;
import po.costPO.CostPO;

@SuppressWarnings("serial")
public class CostData extends UnicastRemoteObject implements CostDataService {
	public CostData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static CostList cl = new CostList();

	@Override
	public CostPO findCost(CostPO cp) {
		// TODO Auto-generated method stub
		return cl.getCostPO(cp);
	}

	@Override
	public void addCost(CostPO cp) {
		// TODO Auto-generated method stub
		cl.addCost(cp);

	}

	@Override
	public void changeCost(CostPO cp1, CostPO cp2) {
		// TODO Auto-generated method stub
		cl.changeCost(cp1, cp2);

	}

	@Override
	public void removeCost(CostPO cp) {
		// TODO Auto-generated method stub
		cl.removeCost(cp);

	}

	@Override
	public ArrayList<CostPO> getCostList() {
		// TODO Auto-generated method stub
		ArrayList<CostPO> a = cl.getCostList();
		return a;
	}

}
