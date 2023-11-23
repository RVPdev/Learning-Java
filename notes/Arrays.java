package notes;

public class Arrays {
    public static void main(String[] args) {
        char vowels[] = new char[5]; // * array declaration of length 5

        int[] intArray = new int[] { 1, 2, 3, 4, 5 };
        String[] strArray = new String[] { "John", "Mary", "Bob" };

        // ! also can be declare like so

        char letters[] = { 'a', 'e', 'u', 'o', 'i' };

        int startingIdx = 1; // * declare for array index from where to where
        int endinggIdx = 4;

        java.util.Arrays.sort(letters, startingIdx, endinggIdx); // * this is supposed to sort it but i get an error, so
                                                                 // idk
        letters[2] = 'x'; // * override a value for anew value

        System.out.println(letters.length); // ! dont need () since its a property of java.util.Arrays

        // * a e i o u - array assinging values
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        System.out.println(vowels[2]); // * print one char
        System.out.println(new String(vowels)); // ! this only works with chars java.util.Arrays

        System.out.println(java.util.Arrays.toString(strArray));
        System.out.println(java.util.Arrays.toString(intArray)); // ? not sure why is not working the toString method...

        char key = 'o'; // * key in vowels for search

        int foundIdx = java.util.Arrays.binarySearch(vowels, key); // * do binary search in arr this return the index of
                                                                   // the item found
        // ! can also work with startingidx and endingidx

        System.out.println(foundIdx);

        java.util.Arrays.fill(vowels, 'x'); // * can populate an array with desired value
        // ! can also be done wit starting index and ending index

        int copyOfNumbers[] = intArray;
        int copyOfNumbers2[] = java.util.Arrays.copyOf(intArray, intArray.length); // * this would maintin the og value of intArray, since it create a new memory
        int copyOfNumbers3[] = java.util.Arrays.copyOfRange(intArray, startingIdx, endinggIdx); // * same as above but on desingated idx 

        java.util.Arrays.fill(intArray, 0); // * this will make both arrays to 0 the copyofnumbers and intarry will be
                                            // * populated with 0s same logic as to no creating a new obj

        System.out.println(java.util.Arrays.toString(intArray));
        System.out.println(java.util.Arrays.toString(copyOfNumbers));
        System.out.println(java.util.Arrays.toString(copyOfNumbers2));
        System.out.println(java.util.Arrays.toString(copyOfNumbers3));
    }
}
