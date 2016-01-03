package dataservice.agencydataservice;

import java.util.ArrayList;

import po.agencyPO.CenterPO;

public interface CenterDataService {
	public CenterPO findCenter(CenterPO cp);

	public void addCenter(CenterPO cp);

	public void changeCenter(CenterPO cp1, CenterPO cp2);

	public void removeCenter(CenterPO cp);

	public ArrayList<CenterPO> getCenterList();

}
