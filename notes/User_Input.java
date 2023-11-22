package notes;

import java.util.Scanner; // ! import from the java

public class User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Whats your name? \n"); //! println vs print, println provides new line print does not "\n" means new line
        String name = scanner.nextLine();

        System.out.printf("Hello %s. How are you?", name); // * printf allows formatting

        scanner.close(); //! remember to close the scanner once done with it
    }

}
