package dataservice.billdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.billPO.BillPO;

public interface BillDataService extends Remote{
	public BillPO findBill(BillPO bp) throws RemoteException;

	public void addBill(BillPO bp) throws RemoteException;

	public void changeBill(BillPO bp1, BillPO bp2) throws RemoteException;

	public void removeBill(BillPO bp) throws RemoteException;

	public ArrayList<BillPO> getBillList() throws RemoteException;

}
