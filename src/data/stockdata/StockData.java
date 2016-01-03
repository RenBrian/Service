package data.stockdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.stockdataservice.StockDataService;
import po.stockPO.StockPO;

@SuppressWarnings("serial")
public class StockData extends UnicastRemoteObject implements StockDataService {
	public StockData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static StockList sl = new StockList();

	@Override
	public void addStock(StockPO sp) {
		// TODO Auto-generated method stub
		sl.addStock(sp);

	}

	@Override
	public void removeStock(StockPO sp) {
		// TODO Auto-generated method stub
		sl.removeStock(sp);

	}

	@Override
	public StockPO findStock(StockPO sp) {
		return sl.getStockPO(sp);
		// TODO Auto-generated method stub

	}

	@Override
	public void changStock(StockPO sp1, StockPO sp2) {
		// TODO Auto-generated method stub
		sl.changeStock(sp1, sp2);
	}

	@Override
	public ArrayList<StockPO> getStockList() {
		// TODO Auto-generated method stub
		ArrayList<StockPO> a = sl.getStockist();
		return a;
	}

}
