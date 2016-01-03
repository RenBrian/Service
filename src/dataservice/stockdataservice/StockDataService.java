package dataservice.stockdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.stockPO.StockPO;

public interface StockDataService extends Remote{
	/*
	 * 入库
	 */
	public void addStock(StockPO sp) throws RemoteException;

	/*
	 * 出库
	 */
	public void removeStock(StockPO sp) throws RemoteException;

	/*
	 * 库存查看
	 */
	public StockPO findStock(StockPO sp) throws RemoteException;

	/*
	 * 库存调整
	 */
	public void changStock(StockPO sp1, StockPO sp2) throws RemoteException;

	/*
	 * 库存盘点
	 */
	public ArrayList<StockPO> getStockList() throws RemoteException;

}
