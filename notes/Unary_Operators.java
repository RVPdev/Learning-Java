package notes;

public class Unary_Operators {
    public static void main(String[] args) {
        int score = 0;
        int turns = 10;

        score += 1; // * add any number to score can be one two or 10000
        score ++; // * increases its value by 1
        turns --; // * decrease value by 1

        System.out.println(score);
        System.out.println(turns);

        int  number = 55;

        System.out.println(number++); // ! will print out -> 55
        System.out.println(++number); // ! will print out -> 56
        System.out.println(number); // * will print out 56
        // ? bacuse it works from left to right, so at the time of printing it prints 55 and then changes it to 56
    }
}
