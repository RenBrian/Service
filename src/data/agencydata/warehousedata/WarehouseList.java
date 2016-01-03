package data.agencydata.warehousedata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.agencyPO.WarehousePO;

@SuppressWarnings("serial")
public class WarehouseList implements Serializable {
	public WarehousePO getWarehousePO(WarehousePO wp) {
		try {
			FileInputStream fis = new FileInputStream("Warehouse.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<WarehousePO> upl = (ArrayList<WarehousePO>) ois.readObject();
			for (WarehousePO po : upl) {
				if (po.getID().equals(wp.getID())) {
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
	public void addWarehouse(WarehousePO wp) {
		try {
			FileInputStream fis = new FileInputStream("Warehouse.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<WarehousePO> upl = (ArrayList<WarehousePO>) ois.readObject();
			upl.add(wp);
			FileOutputStream fs = new FileOutputStream("Warehouse.file");
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

	public void removeWarehouse(WarehousePO wp) {
		try {
			FileInputStream fis = new FileInputStream("Warehouse.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<WarehousePO> upl = (ArrayList<WarehousePO>) ois.readObject();
			WarehousePO a = null;
			for (WarehousePO po : upl) {
				if (po.getID().equals(wp.getID())) {
					a = wp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Warehouse.file");
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

	public void changeWarehouse(WarehousePO wp1, WarehousePO wp2) {

		removeWarehouse(wp1);
		addWarehouse(wp2);
	}

	public ArrayList<WarehousePO> getWarehouseList() {
		try {
			FileInputStream fis = new FileInputStream("Warehouse.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<WarehousePO> upl = (ArrayList<WarehousePO>) ois.readObject();
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
