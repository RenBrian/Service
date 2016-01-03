package dataservice.agencydataservice;

import java.util.ArrayList;

import po.agencyPO.WarehousePO;

public interface WarehouseDataService {
	public WarehousePO findWarehouse(WarehousePO wp);

	public void addWarehouse(WarehousePO wp);

	public void changeWarehouse(WarehousePO wp1, WarehousePO wp2);

	public void removeWarehouse(WarehousePO wp);

	public ArrayList<WarehousePO> getWarehouseList();

}
