package xml;
import java.util.Collection;

/**
 * Ein Interface, welches ein Adressbuch beschreibt, in dem <code>Person</code>-Exemplare verwaltet werden
 * koennen.
 * 
 * @author Michael Paap
 */
public interface AddressBookDataStore {

    /**
     * Fuegt ein Person-Exemplar zum Adressbuch hinzu.
     * 
     * @param p
     *            das hinzuzufuegende Person-Exemplar
     */
    void addPerson(Person p);

    /**
     * Liefert einen Array, der alle Person-Exemplare im Adressbuch enthaelt, welche den uebergebenen String
     * als Nachnamen tragen.
     * 
     * @param name
     *            der Nachname, anhand dessen die Personen gesucht werden sollen
     * @return ein Array mit den Personen, die den uebergebenen Nachnamen tragen
     */
    Person[] getPersons(String name);

    /**
     * Entfernt ein uebergebenes Person-Exemplar aus dem Adressbuch.
     * 
     * @param p
     *            das zu entfernende Person-Exemplar
     */
    void remove(Person p);

    /**
     * Liefert die Information, ob ein Person-Exemplar im Adressbuch enthalten ist, das den uebergebenen
     * String als Nachnamen traegt.
     * 
     * @param name
     *            der Nachname, anhand dessen die Personen gesucht werden sollen
     * @return true, wenn eine Person mit dem gegebenen Nachnamen im Adressbuch ist, sonst false
     */
    boolean contains(String name);

    /**
     * Liefert eine Collection mit allen in diesem Adressbuch enthaltenen Person-Exemplaren. Diese Collection
     * ist nicht modifizierbar, d.h. es ist nicht moeglich, Person-Exemplare hinzuzufuegen oder zu entfernen.
     * Der Versuch, dies zu tun, fuehrt zu einer <code>UnsupportedOperationException</code>.
     * 
     * @return eine nicht modiizierbare Collection mit den in diesem Adressbuch enthaltenen Person-Exemplaren
     */
    Collection<Person> getPersonCollection();
}
