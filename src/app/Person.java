package app;

public class Person {

    private final String firstName;
    private final String lastname;
    private final int yearOfBirth;

    public Person(String firstName, String lastname, int yearOfBirth) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "First name: " + firstName +
                ",     Last name: " + lastname +
                ",    Year Of Birth: " + yearOfBirth;
    }
}
