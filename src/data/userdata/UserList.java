package data.userdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.userPO.UserPO;
import po.userPO.UserRole;

@SuppressWarnings("serial")
public class UserList implements Serializable {

	// public static ArrayList<UserPO> upl;

	public UserPO getUserPO(UserPO up) {
		try {
			FileInputStream fis = new FileInputStream("User.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<UserPO> upl = (ArrayList<UserPO>) ois.readObject();
			for (UserPO po : upl) {
				// System.out.println(po.getID()+" "+id);
				if (po.getID().equals(up.getID())) {
					return po;
				}
			}
			return null;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("User.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<UserPO> upl = new ArrayList<UserPO>();
				UserPO po=new UserPO();
				po.setID("admin");
				po.setPassword("admin");
				po.setRole(UserRole.管理员);
				upl.add(po);
				os.writeObject(upl);
				os.close();
				if(up.getID().equals(po.getClass())&&up.getPassword().equals(po.getPassword()))
					return po;
				return null;
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
	public void addUser(UserPO up) {
		try {
			FileInputStream fis = new FileInputStream("User.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<UserPO> upl = (ArrayList<UserPO>) ois.readObject();
			upl.add(up);
			FileOutputStream fs = new FileOutputStream("User.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();

		} catch (FileNotFoundException e) {
			try {
				ArrayList<UserPO> upl = new ArrayList<UserPO>();
				FileOutputStream fs = new FileOutputStream("User.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				upl.add(up);
				os.writeObject(upl);
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

	public void removeUser(UserPO up) {
		try {
			FileInputStream fis = new FileInputStream("User.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<UserPO> upl = (ArrayList<UserPO>) ois.readObject();
			UserPO a = null;
			for (UserPO po : upl) {
				if (po.getID().equals(up.getID())) {
					a = po;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("User.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("User.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<UserPO> upl = new ArrayList<UserPO>();
				upl.add(up);
				os.writeObject(upl);
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

	public void changeUser(UserPO up1, UserPO up2) {

		removeUser(up1);
		addUser(up2);
	}

	public ArrayList<UserPO> getUserList() {
		try {
			FileInputStream fis = new FileInputStream("User.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<UserPO> upl = (ArrayList<UserPO>) ois.readObject();
			return upl;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("User.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<UserPO> upl = new ArrayList<UserPO>();
				os.writeObject(upl);
				os.close();
				return upl;
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
//		UserPO a = new UserPO("zzzx", "zzzx", UserRole.中转中心业务员);
		UserList ul = new UserList();
//		ul.addUser(a);
		// ArrayList<UserPO> upl=getUserList();
		// for(UserPO po:upl){
		// System.out.println("1+"+po.getID()+po.getPassword()+po.getRole());
		// }
			ArrayList<UserPO>upl=ul.getUserList();
			for (UserPO po : upl) {
				System.out.println(po.getID() + po.getPassword() + po.getRole());
			}

	}

}
