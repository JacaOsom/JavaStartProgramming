import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //2.1
        double celsius, fahrenheit;
        System.out.print("Enter the temperature in Celsius's degrees: ");
        celsius = scanner.nextDouble();
        fahrenheit = 32 + ((double)9/5 * celsius);
        int round = (int)Math.pow(10, 2);
        fahrenheit *= round;
        fahrenheit = Math.round(fahrenheit);
        fahrenheit /= round;
        System.out.println("The temperature in Fahrenheit degrees is: " + fahrenheit);
    }
}
