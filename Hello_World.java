class Main {
    public static void main(String[] args) {
        int number1 = 5;
        double number2 = number1; // convert an integer into a double

        // double number3 = 5.8;
        // int number4 = number3; // cannot translate double to  in since its incopatible

        double number3 = 5.8;
        int number4 = (int)number3; // needs to assing int and tell tha compiler in advance

        System.out.println(number4);
    }
}