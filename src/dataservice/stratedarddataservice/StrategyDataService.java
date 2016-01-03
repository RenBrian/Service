package dataservice.stratedarddataservice;

import java.util.ArrayList;

import po.stratedardPO.StrategyPO;

public interface StrategyDataService {
	public StrategyPO findStrategy(StrategyPO sp);

	public void addStrategy(StrategyPO sp);

	public void changeStrategy(StrategyPO sp1, StrategyPO sp2);

	public void removeStrategy(StrategyPO sp);

	public ArrayList<StrategyPO> getStrategyList();

}
