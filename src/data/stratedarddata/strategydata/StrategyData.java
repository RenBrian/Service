package data.stratedarddata.strategydata;

import java.util.ArrayList;

import dataservice.stratedarddataservice.StrategyDataService;
import po.stratedardPO.StrategyPO;

public class StrategyData implements StrategyDataService {
	public static StrategyList sl = new StrategyList();

	@Override
	public StrategyPO findStrategy(StrategyPO sp) {
		// TODO Auto-generated method stub
		return sl.getStrategyPO(sp);

	}

	@Override
	public void addStrategy(StrategyPO sp) {
		// TODO Auto-generated method stub
		sl.addStrategy(sp);

	}

	@Override
	public void changeStrategy(StrategyPO sp1, StrategyPO sp2) {
		// TODO Auto-generated method stub
		sl.changeStrategy(sp1, sp2);

	}

	@Override
	public void removeStrategy(StrategyPO sp) {
		// TODO Auto-generated method stub
		sl.removeStrategy(sp);

	}

	@Override
	public ArrayList<StrategyPO> getStrategyList() {
		// TODO Auto-generated method stub
		ArrayList<StrategyPO> a = sl.getStrategyList();
		return a;
	}

}
