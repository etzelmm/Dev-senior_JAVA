public class Person {
    // Atributes
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    
    //Constructors
    public Person() {
        this("Alberto","Murillo");
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, "alberto.molina@email.com");
    }

    public Person(String firstName, String lastName, String email) {
        this(firstName, lastName, email, "3162774845");
    }

    public Person(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    // toString

    public String toString() {
        return String.format("Persona: [nombre= %s %s, email= %s, numero telefonico= %s]", firstName, lastName, email, phoneNumber);
    }
}
