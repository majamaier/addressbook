package book4;
import java.util.Arrays;


class ArrayAddressBook {
	private Person[] persons;
	private int freeIndex;
	
	ArrayAddressBook (int arrayStartSize) {
		persons = new Person[arrayStartSize];
	}
	
	void addPerson(Person person) {
		//if addressbook full, double size
		if(freeIndex == (persons.length)) doubleArraySize();
		
		persons[freeIndex] = person;
		freeIndex++;	
	}
	
	private void doubleArraySize() {
		persons = Arrays.copyOf(persons, 2 * persons.length);
	}
	
	String getEntriesAsString() {
		StringBuilder entries = new StringBuilder();
		
		entries.append(freeIndex).append(" von ").append(persons.length).append("\n");
		for (int i = 0; i < freeIndex; i++) {
			entries.append(persons[i].toString() + "\n");
		}
		
		return entries.toString();
	}
}
