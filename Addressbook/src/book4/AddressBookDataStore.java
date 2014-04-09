package book4;

public interface AddressBookDataStore {
 
	/**
	 * Fügt ein Person-Exemplar zum Adressbuch hinzu.
	 * 
	 * @param p
	 *            das hinzuzufügende Person-Exemplar
	 */
	void addPerson(Person p);

	/**
	 * Liefert einen Array, der alle Person-Exemplare im Adressbuch enthält,
	 * welche den übergebenen String als Nachnamen tragen. Anwendungsfall könnte
	 * z.B. sein, sich alle Maiers aus dem Adressbuch geben zu lassen, um dann
	 * einen davon auszuwählen und der Methode remove() als Parameter zum
	 * Löschen zu übergeben.
	 * 
	 * @param name
	 *            der Nachname, anhand dessen die Personen gesucht werden sollen
	 * @return ein Array, mit den Personen, die den übergebenen Nachnamen tragen
	 */
	Person[] getPersons(String name);

	/**
	 * Entfernt das übergebene Person-Exemplar aus dem Adressbuch.
	 * Anwendungsfall könnte z.B. sein, sich mit getPersons(String name) alle
	 * Maiers aus dem Adressbuch geben zu lassen, um dann einen davon
	 * auszuwählen und der Methode remove() als Parameter zum Löschen zu
	 * übergeben.
	 * 
	 * @param p
	 *            das zu entfernende Person-Exemplar
	 */
	void remove(Person p);

	/**
	 * Liefert die Information, ob ein Person-Exemplar im Adressbuch enthalten
	 * ist, das den übergebenen String als Nachnamen trägt.
	 * 
	 * @param name
	 *            der Nachname, anhand dessen die Personen gesucht werden sollen
	 * @return true, wenn eine Person mit dem gegebenen Nachnamen im Adressbuch
	 *         ist, sonst false
	 */
	boolean contains(String name);
}
