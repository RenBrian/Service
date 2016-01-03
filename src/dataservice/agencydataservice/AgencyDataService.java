package dataservice.agencydataservice;

import java.util.ArrayList;

import po.agencyPO.AgencyPO;

public interface AgencyDataService {
	public AgencyPO findAgency(AgencyPO ap);

	public void addAgency(AgencyPO ap);

	public void changeAgency(AgencyPO ap1, AgencyPO ap2);

	public void removeAgency(AgencyPO ap);

	public ArrayList<AgencyPO> getAgencyList();
}
