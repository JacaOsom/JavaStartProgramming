import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
//        2.1
        System.out.println("Exercise 2.1");
        double celsius, fahrenheit;
        System.out.print("Enter the temperature in Celsius's degrees: ");
        celsius = scanner.nextDouble();
        fahrenheit = 32 + ((double)9/5 * celsius);
        int round = (int)Math.pow(10, 2);
        fahrenheit *= round;
        fahrenheit = Math.round(fahrenheit);
        fahrenheit /= round;
        System.out.println("The temperature in Fahrenheit degrees is: " + fahrenheit);
        System.out.println("");

//        2.2
        System.out.println("Exercise 2.2");
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        System.out.println("The result of delta is: " + delta);
        System.out.println("");

//        2.3
        System.out.print("Enter your weight (in kilogram): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        double BMI = weight / Math.pow(height, 2);

        System.out.println("The result of Your BMI is: " + BMI);
        System.out.println("");



    }
}
