package data.expressdata.arrivaldata.centerarrivaldata;

import java.util.ArrayList;

import dataservice.expressdataservice.arrivaldataservice.CenterArrivalDataService;
import po.expressPO.arrivalPO.CenterArrivalPO;

public class CenterArrivalData implements CenterArrivalDataService {
	public static CenterArrivalList cl = new CenterArrivalList();

	@Override
	public CenterArrivalPO findCenterArrival(CenterArrivalPO cp) {
		// TODO Auto-generated method stub
		return cl.getCenterArrivalPO(cp);
	}

	@Override
	public void addCenterArrival(CenterArrivalPO cp) {
		// TODO Auto-generated method stub
		cl.addCenterArrival(cp);

	}

	@Override
	public void changeCenterArrival(CenterArrivalPO cp1, CenterArrivalPO cp2) {
		// TODO Auto-generated method stub
		cl.changeCenterArrival(cp1, cp2);

	}

	@Override
	public void removeCenterArrival(CenterArrivalPO cp) {
		// TODO Auto-generated method stub
		cl.removeCenterArrival(cp);

	}

	@Override
	public ArrayList<CenterArrivalPO> getCenterArrivalList() {
		// TODO Auto-generated method stub
		ArrayList<CenterArrivalPO> a = cl.getCenterArrivalList();
		return a;
	}

}
