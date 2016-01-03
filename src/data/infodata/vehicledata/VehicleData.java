package data.infodata.vehicledata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.infoPO.VehiclePO;
import dataservice.infodataservice.VehicleDataService;

@SuppressWarnings("serial")
public class VehicleData extends UnicastRemoteObject implements VehicleDataService {
	public VehicleData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static VehicleList vl = new VehicleList();

	@Override
	public void addVehicle(VehiclePO po) {
		vl.addVehicle(po);

	}

	@Override
	public void removeVehicle(VehiclePO po) {
		vl.removeVehicle(po);

	}

	@Override
	public void changeVehicle(VehiclePO po1, VehiclePO po2) {
		vl.changeVehicle(po1, po2);

	}

	@Override
	public VehiclePO findVehicle(VehiclePO po) {
		return vl.getVehicle(po);
	}

	@Override
	public ArrayList<VehiclePO> getVehicleList() {
		return vl.getVehicleList();
	}

}
