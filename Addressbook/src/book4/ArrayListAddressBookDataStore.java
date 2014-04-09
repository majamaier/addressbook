package book4;
import java.io.*;
import java.util.ArrayList;

import book4.AddressBookDataStore;


public class ArrayListAddressBookDataStore implements AddressBookDataStore, Serializable {

	private static final long serialVersionUID = 8708506777581525941L;
	private ArrayList<Person> internalList = new ArrayList<Person>();
	
	@Override
	public void addPerson(Person p) {
		internalList.add(p);
	}

	@Override
	public Person[] getPersons(String name) {
		ArrayList<Person> resultList = new ArrayList<Person>();
		for (Person p : internalList) {
			if (name.equals(p.getName())) resultList.add(p);	
		}
		Person[] resultArray = new Person[resultList.size()];
		return resultList.toArray(resultArray);
	}

	@Override
	public void remove(Person p) {
		internalList.remove(internalList.indexOf(p));
	}

	@Override
	public boolean contains(String name) {
		for (Person p : internalList) {
			if (name.equals(p.getName())) return true;
		}
		return false;
	}
	
//	private void readObject(ObjectInputStream in)
//            throws IOException, ClassNotFoundException {
//		in.defaultReadObject();
//		for (Person p : internalList) { p.setPhone1(""); }
//	}
	
	@Override
	public String toString() {
		StringBuilder entries = new StringBuilder();
		for (Person p : internalList) {
			entries.append(p).append("\n");
		}
		return entries.toString();
		
	}
	
}
