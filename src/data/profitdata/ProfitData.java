package data.profitdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.profitdataservice.ProfitDataService;
import po.profitPO.ProfitPO;

@SuppressWarnings("serial")
public class ProfitData extends UnicastRemoteObject implements ProfitDataService {
	public ProfitData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static ProfitList pl = new ProfitList();

	@Override
	public ProfitPO findProfit(ProfitPO pp) {
		// TODO Auto-generated method stub
		return pl.getProfitPO(pp);
	}

	@Override
	public void addProfit(ProfitPO pp) {
		// TODO Auto-generated method stub
		pl.addProfit(pp);

	}

	@Override
	public void changeProfit(ProfitPO pp1, ProfitPO pp2) {
		// TODO Auto-generated method stub
		pl.changeAccount(pp1, pp2);

	}

	@Override
	public void removeProfit(ProfitPO pp) {
		// TODO Auto-generated method stub
		pl.removeProfit(pp);

	}

	@Override
	public ArrayList<ProfitPO> getProfitList() {
		// TODO Auto-generated method stub
		return pl.getProfitList();
	}

}
