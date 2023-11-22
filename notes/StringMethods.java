package notes;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Renato V";
        System.out.println(name.length()); // * provides length of the string
        System.out.println(name.isEmpty()); // * returns boolean true or flase if  string is ""
        System.out.println(name.toUpperCase()); // * turns string into all upper case, but does not mutate the original string
        System.out.println(name.toLowerCase()); // * turns string into all lower case, but does not mutate the original string

        String string1 = new String("abc");
        String string2 = new String("abc");
        String string3 = new String("ABC");

        System.out.println(string1.equals(string2)); // ! this would return true, since its evaluates the content of the str not the memory
        System.out.println(string1.equalsIgnoreCase(string3)); // ! True, since its evaluates the content of the str wihotu aking in consideration the case

        String string = "The Sky is blue";

        System.out.println(string.replace("blue", "red")); // * replaces the string wiht new string, does not mutate the og string
        System.out.println(string.contains("sky")); // * returns bool value depedning if the string contain sub Str
    }
}
