package dataservice.billdataservice;

import java.util.ArrayList;

import po.billPO.BillPO;

public interface BillDataService {
	public BillPO findBill(BillPO bp);

	public void addBill(BillPO bp);

	public void changeBill(BillPO bp1, BillPO bp2);

	public void removeBill(BillPO bp);

	public ArrayList<BillPO> getBillList();

}
