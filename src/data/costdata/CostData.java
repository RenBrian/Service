package data.costdata;

import java.util.ArrayList;

import dataservice.costdataservice.CostDataService;
import po.costPO.CostPO;

public class CostData implements CostDataService {
	public static CostList cl = new CostList();

	@Override
	public CostPO findCost(CostPO cp) {
		// TODO Auto-generated method stub
		return cl.getCostPO(cp);
	}

	@Override
	public void addCost(CostPO cp) {
		// TODO Auto-generated method stub
		cl.addCost(cp);

	}

	@Override
	public void changeCost(CostPO cp1, CostPO cp2) {
		// TODO Auto-generated method stub
		cl.changeCost(cp1, cp2);

	}

	@Override
	public void removeCost(CostPO cp) {
		// TODO Auto-generated method stub
		cl.removeCost(cp);

	}

	@Override
	public ArrayList<CostPO> getCostList() {
		// TODO Auto-generated method stub
		ArrayList<CostPO> a = cl.getCostList();
		return a;
	}

}
