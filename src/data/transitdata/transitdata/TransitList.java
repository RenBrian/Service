package data.transitdata.transitdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.transitPO.TransitPO;

@SuppressWarnings("serial")
public class TransitList implements Serializable {
	public TransitPO getTransitPO(TransitPO tp) {
		try {
			FileInputStream fis = new FileInputStream("Transit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<TransitPO> upl = (ArrayList<TransitPO>) ois.readObject();
			for (TransitPO po : upl) {
				if (po.getID().equals(tp.getID())) {
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
	public void addTransit(TransitPO tp) {
		try {
			FileInputStream fis = new FileInputStream("Transit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<TransitPO> upl = (ArrayList<TransitPO>) ois.readObject();
			upl.add(tp);
			FileOutputStream fs = new FileOutputStream("Transit.file");
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

	public void removeTransit(TransitPO tp) {
		try {
			FileInputStream fis = new FileInputStream("Transit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<TransitPO> upl = (ArrayList<TransitPO>) ois.readObject();
			TransitPO a = null;
			for (TransitPO po : upl) {
				if (po.getID().equals(tp.getID())) {
					a = tp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Transit.file");
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

	public void changeTransit(TransitPO tp1, TransitPO tp2) {

		removeTransit(tp1);
		addTransit(tp2);
	}

	public ArrayList<TransitPO> getTransitList() {
		try {
			FileInputStream fis = new FileInputStream("Transit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<TransitPO> upl = (ArrayList<TransitPO>) ois.readObject();
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
