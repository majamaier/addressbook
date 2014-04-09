package xml;

/**
 * Exemplare dieser Klasse repaesentieren Personen in einem Adressbuch.
 * 
 * @author Michael Paap
 */
public class Person {

    private String name;

    private String prename;
    
    private String phone1;
    
    /**
     * Liefert ein mit Leerstrings initialisiertes Person-Exemplar
     */
    public Person() {
    	this("", "", "");
    }

    /**
     * Liefert ein neues Exemplar dieser Klasse mit dem gegebenen Vor- und Nachnamen
     * 
     * @param prename
     *            der Vorname
     * @param name
     *            der Nachname
     */
    public Person(String prename, String name) {
        this.prename = prename;
        this.name = name;
    }
    
    /**
     * Liefert ein neues Exemplar dieser Klasse mit dem gegebenen Vor- und Nachnamen, sowie Telefonnummer
     * 
     * @param prename
     *            der Vorname
     * @param name
     *            der Nachname
     * @param phone1
     * 			  Telefonnummer
     */
    public Person(String prename, String name, String phone1) {
        this.prename = prename;
        this.name = name;
        this.phone1 = phone1;
    }

    /**
     * Liefert den Nachnamen dieser Person.
     * 
     * @return der Nachname
     */
    public String getName() {
        return name;
    }
    
    /**
     * Ändert den Nachnamen dieser Person.
     * 
     * @param name 
     * 			   der neue Nachname
     */
    public void setName(String name) {
    	this.name = name;
    }
    
    /**
     * Liefert den Vornamen dieser Person.
     * 
     * @return der Vorname
     */
    public String getPrename() {
        return prename;
    }
    
    /**
     * Ändert den Vornamen dieser Person.
     * 
     * @param prename 
     * 			     der neue Vorname
     */
    public void setPrename(String prename) {
    	this.prename = prename;
    }
    
    /**
     * Liefert die Telefonnummer dieser Person.
     * 
     * @return der Vorname
     */
    public String getPhone1() {
        return phone1;
    }
    
    /**
     * Ändert Telefonnummer dieser Person.
     * 
     * @param prename 
     * 			     der neue Vorname
     */
    public void setPhone1(String phone1) {
    	this.phone1 = phone1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return prename + " " + name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Person other = (Person) obj;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        return true;
    }
}