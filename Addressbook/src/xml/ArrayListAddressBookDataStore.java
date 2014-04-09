package xml;

import java.util.*;

public class ArrayListAddressBookDataStore implements AddressBookDataStore {

    private ArrayList<Person> dataStore;

    /**
     * Erzeugt ein neues Exemplar dieser Klasse.
     */
    public ArrayListAddressBookDataStore() {
        dataStore = new ArrayList<Person>();
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.mpaap.addressbook.xml.AddressBookDataStore#addPerson(de.mpaap.addressbook.xml.Person)
     */
    @Override
	public void addPerson(Person p) {
        dataStore.add(p);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.mpaap.addressbook.xml.AddressBookDataStore#getPersons(java.lang.String)
     */
    @Override
	public Person[] getPersons(String name) {
        ArrayList<Person> foundPersons = new ArrayList<Person>();
        for (Person person : dataStore) {
            if (name.equals(person.getName())) {
                foundPersons.add(person);
            }
        }
        return foundPersons.toArray(new Person[foundPersons.size()]);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.mpaap.addressbook.xml.AddressBookDataStore#remove(de.mpaap.addressbook.xml.Person)
     */
    @Override
	public void remove(Person p) {
        for (int i = 0; i < dataStore.size(); i++) {
            if (dataStore.get(i) == p) {
                dataStore.remove(i);
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Size: ").append(dataStore.size());
        for (Person person : dataStore) {
            sb.append("\n").append(person.toString());
        }
        return sb.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.mpaap.addressbook.xml.AddressBookDataStore#contains(java.lang.String)
     */
    @Override
	public boolean contains(String name) {
        return dataStore.contains(new Person("", name));
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.mpaap.addressbook.xml.AddressBookDataStore#getPersonCollection()
     */
    @Override
	public Collection<Person> getPersonCollection() {
        return Collections.unmodifiableCollection(dataStore);
    }
}
