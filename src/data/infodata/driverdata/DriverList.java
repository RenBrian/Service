package data.infodata.driverdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.infoPO.DriverPO;

@SuppressWarnings("serial")
public class DriverList implements Serializable {
	public void addDriver(DriverPO dp) {
		try {
			FileInputStream fis = new FileInputStream("Driver.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DriverPO> dpl = (ArrayList<DriverPO>) ois.readObject();
			dpl.add(dp);
			FileOutputStream fs = new FileOutputStream("Driver.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(dpl);
			os.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Driver.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<DriverPO> dpl = new ArrayList<DriverPO>();
				dpl.add(dp);
				os.writeObject(dpl);
				os.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void removeDriver(DriverPO dp) {
		try {
			FileInputStream fis = new FileInputStream("Driver.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DriverPO> dpl = (ArrayList<DriverPO>) ois.readObject();
			DriverPO a = new DriverPO();
			for (DriverPO po : dpl) {
				if (po.getIDCode().equals(dp.getIDCode()))
					a = po;
			}
			dpl.remove(a);
			FileOutputStream fs = new FileOutputStream("Driver.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(dpl);
			os.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Driver.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<DriverPO> dpl = new ArrayList<DriverPO>();
				dpl.add(dp);
				os.writeObject(dpl);
				os.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void changeDriver(DriverPO dp1, DriverPO dp2) {
		removeDriver(dp1);
		addDriver(dp2);
	}

	public DriverPO getDriverPO(DriverPO po) {
		try {
			FileInputStream fis = new FileInputStream("Driver.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DriverPO> dpl = (ArrayList<DriverPO>) ois.readObject();
			for (DriverPO dp : dpl) {
				if (dp.getIDCode().equals(po.getIDCode()))
					return dp;
			}
			return null;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Driver.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<DriverPO> dpl = new ArrayList<DriverPO>();
				dpl.add(po);
				os.writeObject(dpl);
				os.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<DriverPO> getDriverList() {
		try {
			FileInputStream fis = new FileInputStream("Driver.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DriverPO> dpl = (ArrayList<DriverPO>) ois.readObject();
			return dpl;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Driver.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<DriverPO> dpl = new ArrayList<DriverPO>();
				os.writeObject(dpl);
				os.close();
				return dpl;
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		DriverList dl = new DriverList();
		// DriverPO po=new DriverPO();
		// po.setIDCode("999");
		// po.setName("老司机");
		// dl.addDriver(po);
		// dl.removeDriver(po);
		ArrayList<DriverPO> a = dl.getDriverList();
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i).getIDCode() + a.get(i).getName());
		}
	}
}
