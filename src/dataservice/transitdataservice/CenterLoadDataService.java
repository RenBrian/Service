package dataservice.transitdataservice;

import java.util.ArrayList;

import po.transitPO.CenterLoadPO;

public interface CenterLoadDataService {
	public CenterLoadPO findCenterLoad(CenterLoadPO cp);

	public void addCenterLoad(CenterLoadPO cp);

	public void changeCenterLoad(CenterLoadPO cp1, CenterLoadPO cp2);

	public void removeCenterLoad(CenterLoadPO cp);

	public ArrayList<CenterLoadPO> getCenterLoadList();

}
