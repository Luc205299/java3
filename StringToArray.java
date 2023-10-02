

public class StringToArray {
    public static void main(String[] args) {
        // String is an object that represents the sequence of characters
        /*
         * Different ways/techniques to convert A String into a simple array
         * As with our JavaScript example,
         * we can use a String method also named .split() in JAVA
         */
        String myStr = "We are studying Java Programming Language";
        /*
         * The array length will be based on the element from the string
         * using the literal space " " as a delimiter:
         */
        String strArray[] = myStr.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            // Printing the indices (indexes) of the array with the value of each index:
            System.out.println("Index: " + i + " => " + strArray[i]);
        }
    } // end main()
} // end class file