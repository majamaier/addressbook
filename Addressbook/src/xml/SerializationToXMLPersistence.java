package xml;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

class SerializationToXMLPersistence implements FullPersistence {

	@Override
	public AddressBookDataStore loadBook(String name)
			throws AddressBookException {
		try {
			File file = new File(System.getProperty("user.home") + "/addressbooks/" + name + ".xml");
			FileInputStream fileIn = new FileInputStream(file);
			XMLDecoder xmlDec = new XMLDecoder(fileIn);
			
			String loadedClassName = xmlDec.readObject().toString();
			Integer loadedBookSize = (Integer)xmlDec.readObject();

	        Class<?> requestedClass = Class.forName(loadedClassName);
	        AddressBookDataStore book = (AddressBookDataStore) requestedClass.newInstance();
	        
	        for (int i = 0; i < loadedBookSize; i++) {
	        	book.addPerson((Person)xmlDec.readObject());
	        } 
	        
			xmlDec.close();
			return book;
			
		} catch (Exception e) {
			throw new AddressBookException(e.getMessage());
		}

	}

	@Override
	public void storeBook(AddressBookDataStore book, String name)
			throws AddressBookException {
		try {
			if (!(new File(System.getProperty("user.home") + "/addressbooks/")
					.isDirectory())) {
				new File(System.getProperty("user.home") + "/addressbooks/")
						.mkdir();
			}
			File file = new File(System.getProperty("user.home")
					+ "/addressbooks/" + name + ".xml");
			FileOutputStream fileOut = new FileOutputStream(file);
			XMLEncoder xmlEnc = new XMLEncoder(fileOut);
			
			xmlEnc.writeObject(book.getClass().getName());
			xmlEnc.writeObject(book.getPersonCollection().size());
			for (Person p : book.getPersonCollection()) {
				xmlEnc.writeObject(p);
			}
			xmlEnc.close();

		} catch (Exception e) {
			throw new AddressBookException(e.getMessage());
		}
	}

}
