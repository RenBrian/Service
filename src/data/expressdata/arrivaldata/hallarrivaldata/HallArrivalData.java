package data.expressdata.arrivaldata.hallarrivaldata;

import java.util.ArrayList;

import dataservice.expressdataservice.arrivaldataservice.HallArrivalDataService;
import po.expressPO.arrivalPO.HallArrivalPO;

public class HallArrivalData implements HallArrivalDataService {
	public static HallArrivalList hl = new HallArrivalList();

	@Override
	public HallArrivalPO findHallArrival(HallArrivalPO hp) {
		// TODO Auto-generated method stub
		return hl.getHallArrivalPO(hp);
	}

	@Override
	public void addHallArrival(HallArrivalPO hp) {
		// TODO Auto-generated method stub
		hl.addHallArrival(hp);

	}

	@Override
	public void changeHallArrival(HallArrivalPO hp1, HallArrivalPO hp2) {
		// TODO Auto-generated method stub
		hl.changeHallArrival(hp1, hp2);

	}

	@Override
	public void removeHallArrival(HallArrivalPO hp) {
		// TODO Auto-generated method stub
		hl.removeHallArrival(hp);

	}

	@Override
	public ArrayList<HallArrivalPO> getHallArrivalList() {
		// TODO Auto-generated method stub
		ArrayList<HallArrivalPO> a = hl.getHallArrivalList();
		return a;
	}

}
