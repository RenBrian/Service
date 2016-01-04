package rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import data.accountdata.AccountData;
import data.agencydata.agencydata.AgencyData;
import data.agencydata.centerdata.CenterData;
import data.agencydata.halldata.HallData;
import data.billdata.BillData;
import data.costdata.CostData;
import data.expressdata.arrivaldata.centerarrivaldata.CenterArrivalData;
import data.expressdata.arrivaldata.hallarrivaldata.HallArrivalData;
import data.expressdata.deliverydata.DeliveryData;
import data.infodata.driverdata.DriverData;
import data.infodata.vehicledata.VehicleData;
import data.logdata.LogData;
import data.orderdata.OrderData;
import data.profitdata.ProfitData;
import data.stockdata.StockData;
import data.stratedarddata.standarddata.StandardData;
import data.stratedarddata.strategydata.StrategyData;
import data.transitdata.centerloaddata.CenterLoadData;
import data.transitdata.hallloaddata.HallLoadData;
import data.transitdata.transitdata.TransitData;
import data.transitdata.transitorderdata.TransitOrderData;
import data.userdata.UserData;
import dataservice.accountdataservice.AccountDataService;
import dataservice.agencydataservice.AgencyDataService;
import dataservice.agencydataservice.CenterDataService;
import dataservice.agencydataservice.HallDataService;
import dataservice.billdataservice.BillDataService;
import dataservice.costdataservice.CostDataService;
import dataservice.expressdataservice.arrivaldataservice.CenterArrivalDataService;
import dataservice.expressdataservice.arrivaldataservice.HallArrivalDataService;
import dataservice.expressdataservice.deliverydataservice.DeliveryDataService;
import dataservice.infodataservice.DriverDataService;
import dataservice.infodataservice.VehicleDataService;
import dataservice.logdataservice.LogDataService;
import dataservice.orderdataservice.OrderDataService;
import dataservice.profitdataservice.ProfitDataService;
import dataservice.stockdataservice.StockDataService;
import dataservice.stratedarddataservice.StandardDataService;
import dataservice.stratedarddataservice.StrategyDataService;
import dataservice.transitdataservice.CenterLoadDataService;
import dataservice.transitdataservice.HallLoadDataService;
import dataservice.transitdataservice.TransitDataService;
import dataservice.transitdataservice.TransitOrderDataService;
import dataservice.userdataservice.UserDataService;

public class Server {
	public static String Start(){
		try {
			LocateRegistry.createRegistry(32000);
			UserDataService user=new UserData();
			Naming.bind("rmi://localhost:32000/Ruser", user);
			 
			AccountDataService account = new AccountData();
			Naming.bind("rmi://localhost:32000/Raccount", account);
			
			AgencyDataService agency = new AgencyData();
			Naming.bind("rmi://127.0.0.1:32000/Ragency", agency);
			
			CenterDataService center = new CenterData();
			Naming.bind("rmi://127.0.0.1:32000/Rcenter", center);
			
			HallDataService hall = new HallData();
			Naming.bind("rmi://127.0.0.1:32000/Rhall", hall);
					
			BillDataService bill = new BillData();
			Naming.bind("rmi://127.0.0.1:32000/Rbill", bill);
			
			CostDataService cost = new CostData();
			Naming.bind("rmi://127.0.0.1:32000/Rcost", cost);
			
			CenterArrivalDataService centerarrival = new CenterArrivalData();
			Naming.bind("rmi://127.0.0.1:32000/Rcenterarrival", centerarrival);
			
			HallArrivalDataService hallarrival = new HallArrivalData();
			Naming.bind("rmi://127.0.0.1:32000/Rhallarrival", hallarrival);
			
			DeliveryDataService delivery = new DeliveryData();
			Naming.bind("rmi://127.0.0.1:32000/Rdelivery", delivery);
			
			DriverDataService driver = new DriverData();
			Naming.bind("rmi://127.0.0.1:32000/Rdriver", driver);
			
			VehicleDataService vehicle = new VehicleData();
			Naming.bind("rmi://127.0.0.1:32000/Rvehicle",vehicle);
			
			LogDataService log = new LogData();
			Naming.bind("rmi://127.0.0.1:32000/Rlog", log);
			
			OrderDataService order = new OrderData();
			Naming.bind("rmi://127.0.0.1:32000/Rorder", order);
			
			ProfitDataService profit = new ProfitData();
			Naming.bind("rmi://127.0.0.1:32000/Rprofit", profit);
			
			StockDataService stock = new StockData();
			Naming.bind("rmi://127.0.0.1:32000/Rstock", stock);
			
			StandardDataService standard = new StandardData();
			Naming.bind("rmi://127.0.0.1:32000/Rstandard", standard);
			
			StrategyDataService strategy = new StrategyData();
			Naming.bind("rmi://127.0.0.1:32000/Rstrategy",strategy);
			
			CenterLoadDataService centerload = new CenterLoadData();
			Naming.bind("rmi://127.0.0.1:32000/Rcenterload",centerload);
			
			HallLoadDataService hallload = new HallLoadData();
			Naming.bind("rmi://127.0.0.1:32000/Rhallload",hallload);
			
			TransitDataService transit = new TransitData();
			Naming.bind("rmi://127.0.0.1:32000/Rtransit",transit);
			
			TransitOrderDataService transitorder = new TransitOrderData();
			Naming.bind("rmi://127.0.0.1:32000/Rtransitorder",transitorder);
		
			return"服务器启动成功！";

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
		return "服务器启动失败";
	}

}
