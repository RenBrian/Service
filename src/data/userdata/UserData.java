package data.userdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.userPO.UserPO;
import dataservice.userdataservice.UserDataService;

@SuppressWarnings("serial")
public class UserData extends UnicastRemoteObject implements UserDataService {

	public UserData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static UserList ul = new UserList();

	public UserPO findUser(UserPO up) {
		return ul.getUserPO(up);
	}

	@Override
	public void addUser(UserPO up) {
		ul.addUser(up);
	}

	@Override
	public void changeUser(UserPO up1, UserPO up2) {
		ul.changeUser(up1, up2);
	}

	public void removeUser(UserPO up) {
		ul.removeUser(up);
	}

	public ArrayList<UserPO> getUserList() {
		// return ul.getUserList();
		ArrayList<UserPO> a = ul.getUserList();
		return a;
	}

}
