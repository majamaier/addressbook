package xml;

public interface FullPersistence {
    /**
     * Laedt das Adressbuch mit dem uebergebenen Namen.
     * 
     * @param name
     *            der Name des zu ladenden Adressbuchs
     * @return das geladene Adressbuch
     * @throws AddressBookException
     *             wenn das Laden des Adressbuchs fehlschlaegt
     */
    AddressBookDataStore loadBook(String name) throws AddressBookException;

    /**
     * Speichert das uebergebene Adressbuch unter dem uebergebenene Namen.
     * 
     * @param book
     *            das zu speichernde Adressbuch
     * @param name
     *            der Name, unter dem das Adressbuch gespeichert werden soll
     * @throws AddressBookException
     *             wenn das Speichern des Adressbuchs fehlschlaegt
     */
    void storeBook(AddressBookDataStore book, String name) throws AddressBookException;
}
