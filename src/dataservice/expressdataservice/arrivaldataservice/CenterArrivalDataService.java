package dataservice.expressdataservice.arrivaldataservice;

import java.util.ArrayList;

import po.expressPO.arrivalPO.CenterArrivalPO;

public interface CenterArrivalDataService {
	public CenterArrivalPO findCenterArrival(CenterArrivalPO cp);

	public void addCenterArrival(CenterArrivalPO cp);

	public void changeCenterArrival(CenterArrivalPO cp1, CenterArrivalPO cp2);

	public void removeCenterArrival(CenterArrivalPO cp);

	public ArrayList<CenterArrivalPO> getCenterArrivalList();

}
