package dataservice.infodataservice;

import java.util.ArrayList;

import po.infoPO.VehiclePO;

public interface VehicleDataService {
	public VehiclePO findVehicle(VehiclePO vp);

	public void addVehicle(VehiclePO vp);

	public void removeVehicle(VehiclePO vp);

	public void changeVehicle(VehiclePO vp1, VehiclePO vp2);

	public ArrayList<VehiclePO> getVehicleList();

}
