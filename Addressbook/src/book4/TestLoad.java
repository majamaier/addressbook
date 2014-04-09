package book4;

public class TestLoad {

	public static void main(String[] args) {
		
		// create addressbook
		ArrayListAddressBookDataStore dataStore;

		// load addressbook
		SerializationToFilePersistence serial = new SerializationToFilePersistence();

		try {
			dataStore = (ArrayListAddressBookDataStore) serial.loadBook("listBook1");
			System.out.println("Alle Einträge: \n" + dataStore.toString());
		} catch (AddressBookException e) {
			e.printStackTrace();
		}

	}

}
