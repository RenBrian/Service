package data.logdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.logPO.LogPO;

@SuppressWarnings("serial")
public class LogList implements Serializable {
	public LogPO getLogPO(LogPO lp) {
		try {
			FileInputStream fis = new FileInputStream("Log.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<LogPO> upl = (ArrayList<LogPO>) ois.readObject();
			for (LogPO po : upl) {
				if (po == lp) {
					return po;
				}
			}
			return null;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Log.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<LogPO> lpl = new ArrayList<LogPO>();
				lpl.add(lp);
				os.writeObject(lpl);
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

	@SuppressWarnings("unchecked")
	public void addLog(LogPO lp) {
		try {
			FileInputStream fis = new FileInputStream("Log.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<LogPO> upl = (ArrayList<LogPO>) ois.readObject();
			upl.add(lp);
			FileOutputStream fs = new FileOutputStream("Log.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();

		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Log.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<LogPO> lpl = new ArrayList<LogPO>();
				lpl.add(lp);
				os.writeObject(lpl);
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

	public void removeLog(LogPO lp) {
		try {
			FileInputStream fis = new FileInputStream("Log.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<LogPO> upl = (ArrayList<LogPO>) ois.readObject();
			LogPO a = null;
			for (@SuppressWarnings("unused")
			LogPO po : upl) {
				// if (po.getName().equals(lp.getName())) {
				// a = lp;
				// }
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Log.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Log.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<LogPO> lpl = new ArrayList<LogPO>();
				lpl.add(lp);
				os.writeObject(lpl);
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

	public void changeLog(LogPO lp1, LogPO lp2) {

		removeLog(lp1);
		addLog(lp2);
	}

	public ArrayList<LogPO> getLogList() {
		try {
			FileInputStream fis = new FileInputStream("Log.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<LogPO> upl = (ArrayList<LogPO>) ois.readObject();
			return upl;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Log.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<LogPO> lpl = new ArrayList<LogPO>();
				os.writeObject(lpl);
				os.close();
				return lpl;
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

}
