package dataservice.agencydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.agencyPO.WarehousePO;

public interface WarehouseDataService extends Remote{
	public WarehousePO findWarehouse(WarehousePO wp) throws RemoteException;

	public void addWarehouse(WarehousePO wp) throws RemoteException;

	public void changeWarehouse(WarehousePO wp1, WarehousePO wp2) throws RemoteException;

	public void removeWarehouse(WarehousePO wp) throws RemoteException;

	public ArrayList<WarehousePO> getWarehouseList() throws RemoteException;

}
