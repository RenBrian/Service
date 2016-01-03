package dataservice.stratedarddataservice;

import java.util.ArrayList;

import po.stratedardPO.StandardPO;

public interface StandardDataService {
	public StandardPO findStandard(StandardPO sp);

	public void addStandard(StandardPO sp);

	public void changeStandard(StandardPO sp1, StandardPO sp2);

	public void removeStandard(StandardPO sp);

	public ArrayList<StandardPO> getStandardList();

}
