package notes;

import java.util.Scanner; // ! import from the java

public class User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Whats your name? \n"); //! println vs print, println provides new line print does not "\n" means new line
        String name = scanner.nextLine(); // * takes input plus new line

        System.out.printf("Hello %s. How are you?", name); // * printf allows formatting
        
        int age = scanner.nextInt(); // ! next int just takes input, not new line and the new line stays in the buffer

        scanner.nextLine(); // * input buffer for security, clears the new line from the next int
        
        System.out.printf("%d is an execllent age to start coding.", age); // * printf allows formatting
        
        String language = scanner.nextLine(); //! get the newline form the buffer skipping your input
        
        System.out.printf("%s is a very popular language.", language); //! this will print straigth out without taking input, 


        // * other methods

        int number = Integer.parseInt(scanner.nextLine()); //? safer way to get ints and doubles
        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.println(number);
        System.out.println(gpa);


        scanner.close(); //! remember to close the scanner once done with it
    }

}
