package rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import data.userdata.UserData;
import dataservice.userdataservice.UserDataService;

public class Server {
	public static void main(String[] args){
		try {
			LocateRegistry.createRegistry(32000);
			UserDataService user=new UserData();
			Naming.bind("rmi://localhost:32000/Ruser", user);
			System.out.println("服务器启动成功！");

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
