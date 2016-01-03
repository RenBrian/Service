package dataservice.costdataservice;

import java.util.ArrayList;

import po.costPO.CostPO;

public interface CostDataService {
	public CostPO findCost(CostPO cp);

	public void addCost(CostPO cp);

	public void changeCost(CostPO cp1, CostPO cp2);

	public void removeCost(CostPO cp);

	public ArrayList<CostPO> getCostList();

}
