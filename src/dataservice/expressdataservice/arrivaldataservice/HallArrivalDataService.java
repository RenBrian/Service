package dataservice.expressdataservice.arrivaldataservice;

import java.util.ArrayList;

import po.expressPO.arrivalPO.HallArrivalPO;

public interface HallArrivalDataService {
	public HallArrivalPO findHallArrival(HallArrivalPO hp);

	public void addHallArrival(HallArrivalPO hp);

	public void changeHallArrival(HallArrivalPO hp1, HallArrivalPO hp2);

	public void removeHallArrival(HallArrivalPO hp);

	public ArrayList<HallArrivalPO> getHallArrivalList();

}
