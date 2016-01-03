package dataservice.stockdataservice;

import java.util.ArrayList;

import po.stockPO.StockPO;

public interface StockDataService {
	/*
	 * 入库
	 */
	public void addStock(StockPO sp);

	/*
	 * 出库
	 */
	public void removeStock(StockPO sp);

	/*
	 * 库存查看
	 */
	public StockPO findStock(StockPO sp);

	/*
	 * 库存调整
	 */
	public void changStock(StockPO sp1, StockPO sp2);

	/*
	 * 库存盘点
	 */
	public ArrayList<StockPO> getStockList();

}
