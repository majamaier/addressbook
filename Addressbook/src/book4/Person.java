package book4;
import java.io.*;


public class Person implements Serializable {

	private static final long serialVersionUID = 1787338162529983932L;
	private String name, prename, phone1;
	
	Person (String prename, String name) {
		this.prename = prename;
		this.name = name;
	}
	
	void readObject(ObjectInputStream in)
            throws IOException, ClassNotFoundException {
		phone1 = "";
		in.defaultReadObject();
	}
	
	@Override
	public String toString() {
		// if (phone1 == null) phone1 = "";
		return prename + " " + name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	
	public String getPhone1() {
		return phone1;
	}
	
}
