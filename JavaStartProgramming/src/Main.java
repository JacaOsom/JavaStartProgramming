import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double F, C;
        System.out.println("Please enter temperature in Fahrenheit's degrees");
        F = scanner.nextDouble();
        C = (double)5 / 9 * (F-32);
        System.out.println(C);







    }
}
