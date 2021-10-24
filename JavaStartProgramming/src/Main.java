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
        else {
            for (int i = numberOne; i >= numberTwo; i--)
            {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");
                }
            }
        }

//        3c
        int ii = 1;
        double debt = 80, earningsJan = 50, earningsKarol = 40;
        double repayment = 0;
        do {
            repayment += 0.2 * earningsJan + 0.2 * earningsKarol;
            System.out.println("Day = " + ii++ + ", Repayment = " + repayment);
        } while (debt > repayment);

//        3d
        System.out.print("Please enter number of rows and columns: ");
        int numberA = scanner.nextInt();
        for (int k = 0; k < numberA; k++) {
            for (int j = 0; j < numberA; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

//        3.1
        System.out.println("Please enter the year to check leap year:");
        int year = scanner.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("Year: " + year + " is a leap year!");
        }
        else{
            System.out.println("Year: " + year + " is NOT a leap year!");
        }

//        3.2
        System.out.print("Please enter first integer: ");
        int numberOneOne = scanner.nextInt();
        System.out.print("Please enter second integer: ");
        int numberTwoTwo = scanner.nextInt();

        if (numberOneOne % numberTwoTwo == 0){
            System.out.println("Second integer is divider to first integer.");
        }
        else{
            System.out.println("Second integer IS NOT divider to first integer.");
        }

//        3.3
        System.out.println("Please enter three integers.");
        System.out.print("First integer: ");
        int numberOneOneOne = scanner.nextInt();
        System.out.print("Second integer: ");
        int numberTwoTwoTwo = scanner.nextInt();
        System.out.print("Third integer: ");
        int numberThreeThreeThree = scanner.nextInt();

        int max = 0;
        if (numberOneOneOne > numberTwoTwoTwo){
            if (numberOneOneOne > numberThreeThreeThree){
                max = numberOneOneOne;
            }
            else {
                max = numberThreeThreeThree;
            }
        }
        if (numberTwoTwoTwo >= numberOneOneOne){
            if(numberTwoTwoTwo > numberThreeThreeThree){
                max = numberTwoTwoTwo;
            }
            else{
                max = numberThreeThreeThree;
            }
        }
        System.out.println("The biggest number is: " + max);

//        3.4
        double numberB, numberC;
        System.out.print("Please enter first number: ");
        numberB = scanner.nextDouble();
        System.out.print("Please enter second number: ");
        numberC = scanner.nextDouble();
        System.out.println("Please select one operation: +, -, *, /");
        String operation = scanner.next();


        switch (operation){
            case "+":
                System.out.print(numberB + " + " + numberC + " = " + (numberB + numberC));
                break;
            case "-":
                System.out.print(numberB + " - " + numberC + " = " + (numberB - numberC));
                break;
            case "*":
                System.out.print(numberB + " * " + numberC + " = " + (numberB * numberC));
                break;
            case "/":
                System.out.print(numberB + " / " + numberC + " = " + (numberB / numberC));
                break;
            default:
                System.out.println("Operation does not exist!");
                break;
        }
    }
}
