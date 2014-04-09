package book4;
import book4.AddressBookDataStore;


public interface FullPersistence {

	AddressBookDataStore loadBook(String name) throws AddressBookException;
	
	void storeBook(AddressBookDataStore book, String name) throws AddressBookException;
}
