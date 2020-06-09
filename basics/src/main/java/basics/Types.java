package basics;


import java.util.Arrays;

//Intro to types
public class Types {
    public static void main(String[] args) {
        nonPrimitives();

    }

    private static void primitives() {
        boolean aBool = true;
        char goodChar = 'a';
        //char badChar = "a";
        byte aByte = 10;
        int aInt = 7;
        short goodShort = 25;
        //short badShort = 40000;
        long goodLong = 40000;
        //long badLong = 10000000000;
        float aFloat = 10.123456789f;
        //output 10.1234567
        double aDouble = 10.123456789;
        //output 10.123456789
    }


    private static void nonPrimitives() {
        // string uses titlecase over camelcase due to being an object
        // assign through string literal
        String aString = "This is a test string";
        // assign using the "new" keyword
        String anotherString = new String("Another string");

        // instantiate an array using fixed length notation
        int[] intArray = new int[10];
        intArray[2] = 5;
        intArray[7] = 25;
        intArray[9] = 50;
        System.out.println(Arrays.toString(intArray));

        // instantiate an array using array literal
        String[] stringArray = {"first", "second", "third", "etc"};
        System.out.println(Arrays.toString(stringArray));
        // this would raise "array index out of bounds" error, you cannot assign to an index that doesn't exist
        stringArray[7] = "temp";



    }
}
