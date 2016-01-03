package data.transitdata.centerloaddata;

import java.util.ArrayList;

import dataservice.transitdataservice.CenterLoadDataService;
import po.transitPO.CenterLoadPO;

public class CenterLoadData implements CenterLoadDataService {
	public static CenterLoadList cl = new CenterLoadList();

	@Override
	public CenterLoadPO findCenterLoad(CenterLoadPO cp) {
		// TODO Auto-generated method stub
		return cl.getCenterLoadPO(cp);
	}

	@Override
	public void addCenterLoad(CenterLoadPO cp) {
		// TODO Auto-generated method stub
		cl.addCenterLoad(cp);

	}

	@Override
	public void changeCenterLoad(CenterLoadPO cp1, CenterLoadPO cp2) {
		// TODO Auto-generated method stub
		cl.changeCenterLoad(cp1, cp2);

	}

	@Override
	public void removeCenterLoad(CenterLoadPO cp) {
		// TODO Auto-generated method stub
		cl.removeCenterLoad(cp);

	}

	@Override
	public ArrayList<CenterLoadPO> getCenterLoadList() {
		// TODO Auto-generated method stub
		return cl.getCenterLoadList();
	}

}
