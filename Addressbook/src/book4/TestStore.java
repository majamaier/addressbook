package book4;
public class TestStore {

	public static void main(String[] args) {

		// create addressbook
		ArrayListAddressBookDataStore dataStore = new ArrayListAddressBookDataStore();

		// create persons
		Person p1 = new Person("Maja", "Maier");
		Person p2 = new Person("Anna", "Maier");
		Person p3 = new Person("Dani", "Meier");
		Person p4 = new Person("Jens", "Meyer");

		// fill in persons
		dataStore.addPerson(p1);
		dataStore.addPerson(p2);
		dataStore.addPerson(p3);
		dataStore.addPerson(p4);

		// store addressbook
		SerializationToFilePersistence serial = new SerializationToFilePersistence();
		try {
			serial.storeBook(dataStore, "listBook1");
		} catch (AddressBookException e) {
			e.printStackTrace();

		}
	}

}
