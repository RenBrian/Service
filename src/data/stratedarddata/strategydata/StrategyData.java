package data.stratedarddata.strategydata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.stratedarddataservice.StrategyDataService;
import po.stratedardPO.StrategyPO;

@SuppressWarnings("serial")
public class StrategyData extends UnicastRemoteObject implements StrategyDataService {
	public StrategyData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static StrategyList sl = new StrategyList();

	@Override
	public StrategyPO findStrategy(StrategyPO sp) {
		// TODO Auto-generated method stub
		return sl.getStrategyPO(sp);

	}

	@Override
	public void addStrategy(StrategyPO sp) {
		// TODO Auto-generated method stub
		sl.addStrategy(sp);

	}

	@Override
	public void changeStrategy(StrategyPO sp1, StrategyPO sp2) {
		// TODO Auto-generated method stub
		sl.changeStrategy(sp1, sp2);

	}

	@Override
	public void removeStrategy(StrategyPO sp) {
		// TODO Auto-generated method stub
		sl.removeStrategy(sp);

	}

	@Override
	public ArrayList<StrategyPO> getStrategyList() {
		// TODO Auto-generated method stub
		ArrayList<StrategyPO> a = sl.getStrategyList();
		return a;
	}

}
