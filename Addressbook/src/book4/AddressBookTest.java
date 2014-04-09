package book4;

public class AddressBookTest {

	public static void main(String[] args) {
		//create persons
		Person p1 = new Person("Maja", "Maier");
		Person p2 = new Person("Mama", "Maier");
		Person p3 = new Person("Dani", "Paris");
		Person p4 = new Person("Yara", "Heide");
		
		//create addressbook and fill in persons
		ArrayAddressBook book = new ArrayAddressBook(3);
		book.addPerson(p1);
		book.addPerson(p2);
		book.addPerson(p3);
		book.addPerson(p4);

		
		//fetch persons from book and print
		System.out.println(book.getEntriesAsString());
		

	}

}
