package notes;

public class FormatedStrings {

    public static void main(String[] args) {
        String name = "Renato V";
        String country = "Peru";
        String conpany = "My Company";
        int age = 25;

        String formattedString = String.format("My name is %s. I am from %s. I am %d years old. I work for %s", name,
                country, age, conpany); 
                // * modulus and s for string, d for decimals, and f for doubles and floats, for booleans is b, and for charactes is c

        System.out.println(formattedString);
    }

}
