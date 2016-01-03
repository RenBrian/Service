package dataservice.profitdataservice;

import java.util.ArrayList;

import po.profitPO.ProfitPO;

public interface ProfitDataService {
	public ProfitPO findProfit(ProfitPO pp);

	public void addProfit(ProfitPO pp);

	public void changeProfit(ProfitPO pp1, ProfitPO pp2);

	public void removeProfit(ProfitPO pp);

	public ArrayList<ProfitPO> getProfitList();

}
