package notes;

import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the first number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        // System.out.println(number1);
        // System.out.println(number2);

        System.out.println("What operation do you want to perform? ");

        String operation = scanner.nextLine();

        // * dont forget you can do nested if statements too!

        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        } else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        } else {  // * you can continue to add other else if cases with other operators, similiar to other languages :3
            System.out.printf("%s is not a supported operation.", operation);
        }


        scanner.close();
    }
}
