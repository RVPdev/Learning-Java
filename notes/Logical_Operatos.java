package notes;

public class Logical_Operatos {
    public static void main(String[] args) {
        int age = 25;

        // we just wnat people from 18 to 40 years of age
        System.out.println(age >= 18 && age <= 40); // && -> and operator

        boolean isStudent = false;
        boolean isLibraryMember = true;

        System.out.println(isStudent || isLibraryMember); // || -> or operator

        System.out.println(!isStudent); // ! => not operator

        
    }
}
