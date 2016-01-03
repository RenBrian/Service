package data.billdata;

import java.util.ArrayList;

import dataservice.billdataservice.BillDataService;
import po.billPO.BillPO;

public class BillData implements BillDataService {
	public static BillList bl = new BillList();

	@Override
	public BillPO findBill(BillPO bp) {
		// TODO Auto-generated method stub
		return bl.getBillPO(bp);
	}

	@Override
	public void addBill(BillPO bp) {
		// TODO Auto-generated method stub
		bl.addBill(bp);
	}

	@Override
	public void changeBill(BillPO bp1, BillPO bp2) {
		// TODO Auto-generated method stub
		bl.changeBill(bp1, bp2);
	}

	@Override
	public void removeBill(BillPO bp) {
		// TODO Auto-generated method stub
		bl.removeBill(bp);
	}

	@Override
	public ArrayList<BillPO> getBillList() {
		// TODO Auto-generated method stub
		ArrayList<BillPO> a = bl.getBillList();
		return a;
	}

}