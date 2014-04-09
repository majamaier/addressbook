package book4;

public class AddressBookException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3969352690083204503L;

	public AddressBookException() {
		
	}
	
	AddressBookException(String message) {
		super(message);
	}
}
