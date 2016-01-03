package data.agencydata.halldata;

import java.util.ArrayList;

import dataservice.agencydataservice.HallDataService;
import po.agencyPO.HallPO;

public class HallData implements HallDataService {
	public static HallList hl = new HallList();

	@Override
	public HallPO findHall(HallPO hp) {
		// TODO Auto-generated method stub
		return hl.getHallPO(hp);
	}

	@Override
	public void addHall(HallPO hp) {
		// TODO Auto-generated method stub
		hl.addHall(hp);

	}

	@Override
	public void changeHall(HallPO hp1, HallPO hp2) {
		// TODO Auto-generated method stub
		hl.changeHall(hp1, hp2);

	}

	@Override
	public void removeHall(HallPO hp) {
		// TODO Auto-generated method stub
		hl.removeHall(hp);

	}

	@Override
	public ArrayList<HallPO> getHallList() {
		// TODO Auto-generated method stub
		ArrayList<HallPO> a = hl.getHallList();
		return a;
	}

}
