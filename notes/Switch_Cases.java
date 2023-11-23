package notes;

import java.util.Scanner;

public class Switch_Cases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the first number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What operation do you want to perform? ");

        String operation = scanner.nextLine();

        switch (operation) { // * can add as many cases as we want
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break; //! aways add the break keyword when done with an operation if not it will jump
                       //! to the default or until it hits a break

            case "sub":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;

            default:
                System.out.printf("%s is not a supported operation", operation);
                break;
        } // * you can also add if statements inside the cases for example when dividing by 0

        scanner.close();

    }
}
