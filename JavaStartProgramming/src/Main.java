import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

//        3a
        System.out.println("Please enter any integer: ");
        int numberX = scanner.nextInt();

        if (numberX % 2 == 0){
            System.out.println("Your number (" + numberX + ") is an even number.");
        }
        else{
            System.out.println("Your number (" + numberX + ") is not an even number.");
        }
        if (numberX < 0){
            System.out.println("Your number (" + numberX + ") is a negative number.");
        }
        else {
            System.out.println("Your number (" + numberX + ") is a positive number.");
        }

//        3b
        System.out.println("Please enter two any integer.");
        System.out.print("First integer: ");
        int numberOne = scanner.nextInt();
        System.out.print("Second integer: ");
        int numberTwo = scanner.nextInt();

        if (numberOne <= numberTwo){
            for (int i = 0; i <= numberTwo; i++){
                if (i % 2 == 0){
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
