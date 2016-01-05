package po.transitPO;

@SuppressWarnings("serial")
public class HallLoadPO extends TransitOrderPO{
	
	private String idOfHall;//营业厅编号
	private String arrival;//到达地
//	private String  escort;//押运员
	private String idOfVehicle;//车辆代号
	
	public void setIDOfVehicle(String id){
		this.idOfVehicle=id;
	}
	public String getIDOfVehicle(){
		return idOfVehicle;
	}
	
	public HallLoadPO(){
		super();
	}

	public void setIDofHall(String id){
		this.idOfHall=id;
	}
	
	public String getIDOfHall(){
		return idOfHall;
	}
	
	public void setArrival(String arrival){
		this.arrival=arrival;
	}
	public String getArrival(){
		return arrival;
	}
//	public void setEscort(String escort){
//		this.escort=escort;
//	}
//	public String getEscort(){
//		return escort;
//	}


}
