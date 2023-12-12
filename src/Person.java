public class Person {
    public String firstName;
    public String lastName;
    public int age;

    // Constructor & Misc
    public Person(String firstName, String lastName, int age) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
    }

    public String toString() {
        return String.format("First name: %s | Last Name: %s | Age: %d", firstName, lastName, age);
    }

    // Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void lastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}