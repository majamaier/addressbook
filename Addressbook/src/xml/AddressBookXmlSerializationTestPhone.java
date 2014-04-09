package xml;

public class AddressBookXmlSerializationTestPhone {
	 public static void main(String[] args) {
	     try {
	
	         FullPersistence fp = new SerializationToXMLPersistence();
	         AddressBookDataStore book1 = fp.loadBook("first");
	         System.out.println("loaded");
	         System.out.println(book1);

	         book1.addPerson(new Person("Mickey", "Mouse", "0180666666"));
	         book1.addPerson(new Person("Donald", "Duck", "0180777777"));
	         book1.addPerson(new Person("Bugs", "Bunny", "0180888888"));
	         
	         fp.storeBook(book1, "second");
	         System.out.println("stored");
	         
	     } catch (Exception e) {
	         e.printStackTrace();
	     }
	 }
	}
