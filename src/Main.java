import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String p1FirstName = InputHelper.getNonZeroLenString(scanner, "Enter the first person's first name.");
        String p1LastName = InputHelper.getNonZeroLenString(scanner, "Enter the first person's last name.");
        int p1Age = InputHelper.getPositiveNonZeroInt(scanner, "Enter the first person's age.");

        String p2FirstName = InputHelper.getNonZeroLenString(scanner, "Enter the second person's first name.");
        String p2LastName = InputHelper.getNonZeroLenString(scanner, "Enter the second person's last name.");
        int p2Age = InputHelper.getPositiveNonZeroInt(scanner, "Enter the second person's age.");

        Person personOne = new Person(p1FirstName, p1LastName, p1Age);
        Person personTwo = new Person(p2FirstName, p2LastName, p2Age);

        System.out.println("Person one info: " + personOne.toString());
        System.out.println("Person two info: " + personTwo.toString());
    }
}