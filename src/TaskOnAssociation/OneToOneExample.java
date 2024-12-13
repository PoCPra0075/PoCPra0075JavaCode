package TaskOnAssociation;

class Person {
    private String name;
    private Passport passport;

    public Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public void displayDetails() {
        System.out.println("Person: " + name);
        System.out.println("Passport: " + passport.getPassportNumber());
    }
}

class Passport {
    private String passportNumber;

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}

public class OneToOneExample {
    public static void main(String[] args) {
        Passport passport = new Passport("A1234567");
        Person person = new Person("John Doe", passport);

        person.displayDetails();
    }
}
