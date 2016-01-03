package data.expressdata.arrivaldata.centerarrivaldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.expressPO.arrivalPO.CenterArrivalPO;

@SuppressWarnings("serial")
public class CenterArrivalList implements Serializable {
	public CenterArrivalPO getCenterArrivalPO(CenterArrivalPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CenterArrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CenterArrivalPO> upl = (ArrayList<CenterArrivalPO>) ois.readObject();
			for (CenterArrivalPO po : upl) {
				if (po.getID().equals(cp.getID())) {
					return po;
				}
			}
			return null;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public void addCenterArrival(CenterArrivalPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CenterArrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<CenterArrivalPO> upl = (ArrayList<CenterArrivalPO>) ois.readObject();
			upl.add(cp);
			FileOutputStream fs = new FileOutputStream("CenterArrival.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void removeCenterArrival(CenterArrivalPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CenterArrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CenterArrivalPO> upl = (ArrayList<CenterArrivalPO>) ois.readObject();
			CenterArrivalPO a = null;
			for (CenterArrivalPO po : upl) {
				if (po.getID().equals(cp.getID())) {
					a = cp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("CenterArrival.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void changeCenterArrival(CenterArrivalPO cp1, CenterArrivalPO cp2) {

		removeCenterArrival(cp1);
		addCenterArrival(cp2);
	}

	public ArrayList<CenterArrivalPO> getCenterArrivalList() {
		try {
			FileInputStream fis = new FileInputStream("CenterArrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CenterArrivalPO> upl = (ArrayList<CenterArrivalPO>) ois.readObject();
			return upl;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
