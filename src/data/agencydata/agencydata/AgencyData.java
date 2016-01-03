package data.agencydata.agencydata;

import java.util.ArrayList;

import dataservice.agencydataservice.AgencyDataService;
import po.agencyPO.AgencyPO;

public class AgencyData implements AgencyDataService {
	public static AgencyList al = new AgencyList();

	@Override
	public AgencyPO findAgency(AgencyPO ap) {
		// TODO Auto-generated method stub
		return al.getAgencyPO(ap);
	}

	@Override
	public void addAgency(AgencyPO ap) {
		// TODO Auto-generated method stub
		al.addAgency(ap);

	}

	@Override
	public void changeAgency(AgencyPO ap1, AgencyPO ap2) {
		// TODO Auto-generated method stub
		al.changeAgency(ap1, ap2);

	}

	@Override
	public void removeAgency(AgencyPO ap) {
		// TODO Auto-generated method stub
		al.removeAgency(ap);

	}

	@Override
	public ArrayList<AgencyPO> getAgencyList() {
		// TODO Auto-generated method stub
		ArrayList<AgencyPO> a = al.getAgencyList();
		return a;
	}

}
