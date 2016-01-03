package dataservice.infodataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.infoPO.VehiclePO;

public interface VehicleDataService extends Remote{
	public VehiclePO findVehicle(VehiclePO vp) throws RemoteException;

	public void addVehicle(VehiclePO vp) throws RemoteException;

	public void removeVehicle(VehiclePO vp) throws RemoteException;

	public void changeVehicle(VehiclePO vp1, VehiclePO vp2) throws RemoteException;

	public ArrayList<VehiclePO> getVehicleList() throws RemoteException;

}
