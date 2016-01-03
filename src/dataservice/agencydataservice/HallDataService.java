package dataservice.agencydataservice;

import java.util.ArrayList;

import po.agencyPO.HallPO;

public interface HallDataService {
	public HallPO findHall(HallPO hp);

	public void addHall(HallPO hp);

	public void changeHall(HallPO hp1, HallPO hp2);

	public void removeHall(HallPO hp);

	public ArrayList<HallPO> getHallList();

}
