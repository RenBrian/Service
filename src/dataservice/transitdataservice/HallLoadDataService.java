package dataservice.transitdataservice;

import java.util.ArrayList;

import po.transitPO.HallLoadPO;

public interface HallLoadDataService {
	public HallLoadPO findHallLoad(HallLoadPO hp);

	public void addHallLoad(HallLoadPO hp);

	public void changeHallLoad(HallLoadPO hp1, HallLoadPO hp2);

	public void removeHallLoad(HallLoadPO hp);

	public ArrayList<HallLoadPO> getHallLoadList();

}
