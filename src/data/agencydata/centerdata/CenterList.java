package data.agencydata.centerdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.agencyPO.CenterPO;

@SuppressWarnings("serial")
public class CenterList implements Serializable {
	public CenterPO getCenterPO(CenterPO cp) {
		try {
			FileInputStream fis = new FileInputStream("Center.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CenterPO> upl = (ArrayList<CenterPO>) ois.readObject();
			for (CenterPO po : upl) {
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
	public void addCenter(CenterPO cp) {
		try {
			FileInputStream fis = new FileInputStream("Center.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<CenterPO> upl = (ArrayList<CenterPO>) ois.readObject();
			upl.add(cp);
			FileOutputStream fs = new FileOutputStream("Center.file");
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

	public void removeCenter(CenterPO cp) {
		try {
			FileInputStream fis = new FileInputStream("Center.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CenterPO> upl = (ArrayList<CenterPO>) ois.readObject();
			CenterPO a = null;
			for (CenterPO po : upl) {
				if (po.getID().equals(cp.getID())) {
					a = cp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Center.file");
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

	public void changeCenter(CenterPO cp1, CenterPO cp2) {

		removeCenter(cp1);
		addCenter(cp2);
	}

	public ArrayList<CenterPO> getCenterList() {
		try {
			FileInputStream fis = new FileInputStream("Center.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CenterPO> upl = (ArrayList<CenterPO>) ois.readObject();
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
