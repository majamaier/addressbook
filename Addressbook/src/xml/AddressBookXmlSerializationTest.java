package xml;


//Testklasse 
public class AddressBookXmlSerializationTest {
 public static void main(String[] args) {
     try {
         Class<?> requestedClass = Class.forName(args[0]);
         AddressBookDataStore book1 = (AddressBookDataStore) requestedClass.newInstance();

         book1.addPerson(new Person("Martin", "Mustermann"));
         book1.addPerson(new Person("Max", "Mustermann"));
         book1.addPerson(new Person("Martina", "Mustermann"));
         book1.addPerson(new Person("Hans", "Wurst"));
         book1.addPerson(new Person("Hans", "tsruW"));
         System.out.println(book1);

         FullPersistence fp = new SerializationToXMLPersistence();
         fp.storeBook(book1, "first");
         System.out.println("stored");

         AddressBookDataStore book2 = fp.loadBook("first");
         System.out.println("loaded");
         System.out.println(book2);
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
