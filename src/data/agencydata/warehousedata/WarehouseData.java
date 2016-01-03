package data.agencydata.warehousedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.agencydataservice.WarehouseDataService;
import po.agencyPO.WarehousePO;

@SuppressWarnings("serial")
public class WarehouseData extends UnicastRemoteObject implements WarehouseDataService {
	public WarehouseData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static WarehouseList wl = new WarehouseList();

	@Override
	public WarehousePO findWarehouse(WarehousePO wp) {
		// TODO Auto-generated method stub
		return wl.getWarehousePO(wp);
	}

	@Override
	public void addWarehouse(WarehousePO wp) {
		// TODO Auto-generated method stub
		wl.addWarehouse(wp);

	}

	@Override
	public void changeWarehouse(WarehousePO wp1, WarehousePO wp2) {
		// TODO Auto-generated method stub
		wl.changeWarehouse(wp1, wp2);

	}

	@Override
	public void removeWarehouse(WarehousePO wp) {
		// TODO Auto-generated method stub
		wl.removeWarehouse(wp);

	}

	@Override
	public ArrayList<WarehousePO> getWarehouseList() {
		// TODO Auto-generated method stub
		ArrayList<WarehousePO> a = wl.getWarehouseList();
		return a;
	}

}
