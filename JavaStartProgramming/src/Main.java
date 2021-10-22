import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        /*double F, C;
        System.out.println("Please enter temperature in Fahrenheit's degrees");
        F = scanner.nextDouble();
        C = (double)5 / 9 * (F-32);
        System.out.println(C);*/

//        final int PCs = 24;
//        int students;
//        double result;
//        System.out.printf("Enter the number of students: ");
//        students = scanner.nextInt();
//        result = (double)students / PCs;
//        System.out.println("The result is: " + result);

        double age, money;
        boolean cinema;
        System.out.printf("Enter the age: ");
        age = scanner.nextDouble();
        System.out.printf("How much money do you have?: ");
        money = scanner.nextDouble();
        cinema = (age >= 18 && money >= 20);
        System.out.println("The result is: " + cinema);






    }
}
