class Main {
    static int age = 27; // larger scope able to be used in the entire main class
    // static int age; If you dont declare the value in the global scope Java will do it automatically to 0
    public static void main(String[] args) {
        // int age; // local vatialbe
        // age = 25; // variable decalration || also assing new value to the age variable inside a method

        // Also
        // int age = 27;
        System.out.println("I'm " + age + " years old." );
    }
}