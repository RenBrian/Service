package dataservice.infodataservice;

import java.util.ArrayList;

import po.infoPO.DriverPO;

public interface DriverDataService {
	public DriverPO findDriver(DriverPO dp);

	public void addDriver(DriverPO dp);

	public void removeDriver(DriverPO dp);

	public void changeDriver(DriverPO dp1, DriverPO dp2);

	public ArrayList<DriverPO> getDricerList();

}
