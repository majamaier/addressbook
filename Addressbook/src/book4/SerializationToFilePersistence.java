package book4;
import java.io.*;

import book4.AddressBookDataStore;

public class SerializationToFilePersistence implements FullPersistence {

    @Override
    public AddressBookDataStore loadBook(String name)
            throws AddressBookException {

        try {
            FileInputStream fileIn = new FileInputStream(System.getProperty("user.home") + "/addressbooks/" + name);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            ArrayListAddressBookDataStore loadedBook = ((ArrayListAddressBookDataStore) objectIn.readObject());
            objectIn.close();
            return loadedBook;
           
        } catch (Exception e) {
            throw new AddressBookException(e.getMessage());
        }
    } 

	@Override
	public void storeBook(AddressBookDataStore book, String name)
			throws AddressBookException {
		try {
			File file = new File(System.getProperty("user.home") + "/addressbooks/" + name);
			FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(book);
			objectOut.close();
			
		} catch (Exception e) {
			throw new AddressBookException(e.getMessage());
		}
	}
	
}
