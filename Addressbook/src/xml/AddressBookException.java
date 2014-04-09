package xml;

/**
 * Eine Exception fuer Ausnahmen, die beim Arbeiten mit Adressbuechern auftreten
 * 
 * @author Michael Paap
 */
public class AddressBookException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Erzeugt ein neues Exemplar dieser Klasse mit der uebergebenen Fehlernachricht.
     * 
     * @param message
     *            die Fehlernachricht
     */
	AddressBookException(String message) {
        super(message);
    }
}
