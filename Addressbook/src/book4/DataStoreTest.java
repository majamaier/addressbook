package book4;
import book4.AddressBookDataStore;

public class DataStoreTest {

	public static void main(String[] args) {

		try {
			Class<?> mysteryClass = Class.forName(args[0]);
			Object storageClass = mysteryClass.newInstance();
			AddressBookDataStore dataStore = ((AddressBookDataStore) storageClass);

			// create persons
			Person p1 = new Person("Maja", "Maier");
			Person p2 = new Person("Anna", "Maier");
			Person p3 = new Person("Dani", "Meier");
			Person p4 = new Person("Jens", "Meyer");

			// create addressbook and fill in persons
			dataStore.addPerson(p1);
			dataStore.addPerson(p2);
			dataStore.addPerson(p3);
			dataStore.addPerson(p4);
			
			// test getStrings
			System.out.println("Alle Einträge: \n" + dataStore.toString());
			System.out.println("Einträge mit Namen Maier: ");
			for (Person p : dataStore.getPersons("Maier"))
				System.out.println(p.toString());
			System.out.println();

			// test remove
			Person[] searchresult = dataStore.getPersons("Maier");
			dataStore.remove(searchresult[0]);
			System.out.println("Alle Einträge: \n" + dataStore.toString());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException i) {
			i.printStackTrace();
		} catch (IllegalAccessException a) {
			a.printStackTrace();
		}
	}

}
