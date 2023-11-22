package notes;

public class Strings {
    public static void main(String[] args) {
        char percentSing = '%'; // * only used for one character
        // ! use '' for single chars if you use "" it will be considered a string

        String name = "Renato V"; // * correct way to declare string

        String name2 = new String("Renato V"); // * using a class with the new keyword
        // ? why use this? to allocate a original string

        System.out.println(percentSing);
        System.out.println(name);
        System.out.println(name2);

        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectStr = new String("xyz");
        String objectStr2 = new String("xyz");

        System.out.println(literalString1 == literalString2); // * used already asigned memory hence the output is -> true
        System.out.println(objectStr == objectStr2); // ! returns false since it allocates new memory for each object

    }
}
