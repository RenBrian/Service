package data.agencydata.centerdata;

import java.util.ArrayList;

import dataservice.agencydataservice.CenterDataService;
import po.agencyPO.CenterPO;

public class CenterData implements CenterDataService {
	public static CenterList cl = new CenterList();

	@Override
	public CenterPO findCenter(CenterPO cp) {
		// TODO Auto-generated method stub
		return cl.getCenterPO(cp);
	}

	@Override
	public void addCenter(CenterPO cp) {
		// TODO Auto-generated method stub
		cl.addCenter(cp);

	}

	@Override
	public void changeCenter(CenterPO cp1, CenterPO cp2) {
		// TODO Auto-generated method stub
		cl.changeCenter(cp1, cp2);

	}

	@Override
	public void removeCenter(CenterPO cp) {
		// TODO Auto-generated method stub
		cl.removeCenter(cp);
		;

	}

	@Override
	public ArrayList<CenterPO> getCenterList() {
		// TODO Auto-generated method stub
		ArrayList<CenterPO> a = cl.getCenterList();
		return a;
	}

}
