package data.infodata.driverdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.infoPO.DriverPO;
import dataservice.infodataservice.DriverDataService;

@SuppressWarnings("serial")
public class DriverData extends UnicastRemoteObject implements DriverDataService {
	public DriverData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static DriverList dl = new DriverList();

	@Override
	public void addDriver(DriverPO po) {
		dl.addDriver(po);

	}

	@Override
	public void removeDriver(DriverPO po) {
		dl.removeDriver(po);

	}

	@Override
	public void changeDriver(DriverPO po1, DriverPO po2) {
		dl.changeDriver(po1, po2);

	}

	@Override
	public DriverPO findDriver(DriverPO po) {
		return dl.getDriverPO(po);
	}

	@Override
	public ArrayList<DriverPO> getDricerList() {
		return dl.getDriverList();
	}

}
