package po.expressPO.arrivalPO;

@SuppressWarnings("serial")
public class CenterArrivalPO extends HallArrivalPO{
	
	private String CenterID;//中转中心编号
	
	public CenterArrivalPO(){
		super();
	}
	
	public void setCenter(String id){
		this.CenterID=id;
	}
	public String getCenter(String id){
		return CenterID;
	}

}
