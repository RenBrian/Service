package dataservice.userdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.userPO.UserPO;

public interface  UserDataService extends Remote {

	public UserPO findUser(UserPO up)throws RemoteException;

	public void addUser(UserPO up)throws RemoteException;

	public void changeUser(UserPO up1, UserPO up2)throws RemoteException;

	public void removeUser(UserPO up)throws RemoteException;

	public ArrayList<UserPO> getUserList()throws RemoteException;
}
