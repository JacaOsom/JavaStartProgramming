import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName, lastName;
        int age;
        System.out.println("Hello user! Please, enter your first name, last name and age!");
        System.out.print("First name: ");
        firstName = scanner.next();
        System.out.print("Last name: ");
        lastName = scanner.next();
        System.out.print("Age: ");
        age = scanner.nextInt();

        System.out.println("Hello " + firstName + " " + lastName + "!");
        System.out.println("Your age is: " + age);
    }
}
