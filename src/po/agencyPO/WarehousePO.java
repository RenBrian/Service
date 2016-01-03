package po.agencyPO;

@SuppressWarnings("serial")
public class WarehousePO extends AgencyPO{
	
	 private static int MAX_NUMBER;			//最大容量 常量（需要set与get吗）
	 private double rate;		//警戒比例（0-1）
	 
		//最大容量
		public void setMAX_NUMBER(int num){
			WarehousePO.MAX_NUMBER = num;
		}
		public int getMAX_NUMBER(){
			return MAX_NUMBER;
		}
		//警戒比例
		public void setRate(double r){
			this.rate = r;
		}
		public double getRate(){
			return rate;
		}

}
