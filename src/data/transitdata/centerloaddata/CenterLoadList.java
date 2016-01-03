package data.transitdata.centerloaddata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.transitPO.CenterLoadPO;

@SuppressWarnings("serial")
public class CenterLoadList implements Serializable {
	public CenterLoadPO getCenterLoadPO(CenterLoadPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CenterLoad.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CenterLoadPO> upl = (ArrayList<CenterLoadPO>) ois.readObject();
			for (CenterLoadPO po : upl) {
				if (po.getIDOfHall().equals(cp.getIDOfHall())) {
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
	public void addCenterLoad(CenterLoadPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CenterLoad.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<CenterLoadPO> upl = (ArrayList<CenterLoadPO>) ois.readObject();
			upl.add(cp);
			FileOutputStream fs = new FileOutputStream("CenterLoad.file");
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

	public void removeCenterLoad(CenterLoadPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CenterLoad.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CenterLoadPO> upl = (ArrayList<CenterLoadPO>) ois.readObject();
			CenterLoadPO a = null;
			for (CenterLoadPO po : upl) {
				if (po.getIDOfHall().equals(cp.getIDOfHall())) {
					a = cp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("CenterLoad.file");
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

	public void changeCenterLoad(CenterLoadPO cp1, CenterLoadPO cp2) {

		removeCenterLoad(cp1);
		addCenterLoad(cp2);
	}

	public ArrayList<CenterLoadPO> getCenterLoadList() {
		try {
			FileInputStream fis = new FileInputStream("CenterLoad.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CenterLoadPO> upl = (ArrayList<CenterLoadPO>) ois.readObject();
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
