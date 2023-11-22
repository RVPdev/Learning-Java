package notes;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Renato V";
        System.out.println(name.length()); // * provides length of the string
        System.out.println(name.isEmpty()); // * returns boolean true or flase if  string is ""
        System.out.println(name.toUpperCase()); // * turns string into all upper case, but does not mutate the original string
        System.out.println(name.toLowerCase()); // * turns string into all lower case, but does not mutate the original string

    }
}
