/*
package com.amigoscode;

public class Compile {
    public static void main(String[] args) {
        System.out.println("I can compile and run from the terminal. Hooray 🎉");
    }
}
 */

/*
package com.amigoscode;

public class Compile {
    public static void main(String[] args) {
         String name= "amigoscode";
        System.out.println(name.replace("a","A"));
        String sol = name.substring(0,1).toUpperCase() + name.substring(1);
        System.out.println(sol);


    }
}
*/

//////////////////////////////////////////Arrays & Loops//////////////////////////////////////////////

package com.amigoscode;

import java.util.Arrays;

public class Compile {

    // method for reversing any words
    private static String reversing(String word) {
        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }

        return result;
    }

    private static String transformExampleTwo(String word) {
        String[] cont = word.split(" ");
        String result = "";
        for (int i = 3; i < cont.length; i++) {
            result += cont[i].trim();
        }
        result = result.substring(0, 1).toUpperCase() + result.substring(1);
        return result;
    }

    private static String longestStringInArray(String[] array) {
        // String[] arroro = {"hello", "hello", "ola", "bye", "ciao"};
        String resultoo = "";
        int maxlen = 0;

        if (array == null || array.length == 0) {
            return "";
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] != null && (array[i].length() > maxlen || (array[i].length() == maxlen && !resultoo.contains(array[i])))) {
                maxlen += array[i].length();
                resultoo += array[i] + " ";
            }
        }
        return resultoo;
    }

    public static void main(String[] args) {
        // declare an empty integer array of length = 3
        // print the contents to the console
        int[] len = new int[3];
        System.out.println(Arrays.toString(len));
        Arrays.fill(len, 4);
        System.out.println(Arrays.toString(len));
        len[1] = 17;
        System.out.println(Arrays.toString(len));
        String[] alpha = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(alpha));
        String[] newalpha = alpha;
        newalpha[0] = "z";
        System.out.println("alpha : " + Arrays.toString(alpha));
        System.out.println("new alpha : " + Arrays.toString(newalpha));
        String[] newalpha2 = Arrays.copyOf(alpha, 5);
        newalpha2[0] = "Q";
        System.out.println("alpha : " + Arrays.toString(alpha));
        System.out.println("new alpha 2 : " + Arrays.toString(newalpha2));
        String[] newalpha3 = Arrays.copyOf(alpha, 3);
        newalpha3[0] = "H";
        System.out.println("alpha : " + Arrays.toString(alpha));
        System.out.println("new alpha 3 : " + Arrays.toString(newalpha3));
        ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("////////////////////////////////////////////////////////////////////");


        String[] aa = {"a", "b", "c", "d"};
        // create a `for` loop which prints each item in the array
        for (String item : aa) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("/////////");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array
        int[] array = new int[11];
        for (int i = 0; i < 11; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));

        // create an array of n numbers
        // create a sum variable
        // create a loop
        // add each item to the sum value
        // outside the loop print the total sum
        int[] aroro = {3, 65, 8, 3};
        int st = 0;
        for (int i = 0; i < aroro.length; i++) {
            st = st + aroro[i];
        }
        System.out.println(st);

        // create a for loop which goes through each string in our array
        // make each word uppercase
        // assign the value in the array to the uppercase string
        // print our resulting array
        String[] ex = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < ex.length; i++) {
            ex[i] = ex[i].toUpperCase();
        }
        System.out.println(Arrays.toString(ex));

        // create a for loop which goes through each string in our array
        // grab the first letter of our word
        // capitalise the first letter
        // add the capitalised letter to the rest of the provided word
        // assign the value to an array
        // print our resulting array
        String[] ex2 = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < ex2.length; i++) {
            ex2[i] = ex2[i].substring(0, 1).toUpperCase() + ex2[i].substring(1);
        }
        System.out.println(Arrays.toString(ex2));

        /*
        Write a program that reverses an array of Strings
        String[] content = {"you", "are", "how", "hello"}
        Tip. Use for loop and you to start at highest index.
        Output should be: hello how are you?. Note question mark at the end
        */
        String[] content = {"you", "are", "how", "hello"};
        for (int i = content.length - 1; i >= 0; i--) {
            System.out.print(content[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.print("?");
        System.out.println();
        System.out.println("/////////");
        /*
        Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

        Tip:
        - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        - create variable to store result. double result = 0;
        - convert string to array by using the String[] numbers = input.split(", ")
        - then loop.
        - convert each string to decimal and add to current result
            - use Double.parseDouble(string) to convert a string to double
        */
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] numbers = input.split(", ");
        for (int i = 0; i < numbers.length; i++) {
            double ij = Double.parseDouble(numbers[i]);
            result += ij;
        }
        System.out.println(result);
        System.out.println();

        // create a String variable and assign it a value
        // create an `if` statement which grabs the first letter of your word and compares it against a Character value
        // print something to the console if the condition is met
        String jojo = "Mazen";
        if (jojo.toLowerCase().charAt(0) == 'm') {
            System.out.println("horray");
        }

        // create a String variable and assign it a value
        // create a `for` loop which wraps around your answer from Question 7
        // modify your `if` statement to check the character at each index
        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
        // print something to the console if the condition is met
        String mojo = "Sara";
        boolean flag = false;
        for (int i = 0; i < mojo.length(); i++) {
            if (mojo.toLowerCase().charAt(i) == 'a') {
                System.out.println("hooooooooooooooooooray");
                flag = true;
                // this is to break from the loop if it founds a single char that matches the selected char
                break;
            }
        }
        if (!flag) {
            System.out.println("the character is not included");
        }
        System.out.println();

        // create a for loop which goes from 0 to 20
        // print each even value
        for (int i = 0; i < 21; i++) {
            if (i == 0) {
                System.out.println(i + " is zero");
            } else if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            } else {
                System.out.println(i + " is an odd number");
            }
        }
        System.out.println();

        /*
        Write a method that reverses any String and print to console
        Input should be a string
        Output should be reversed input
        */
        System.out.println(reversing("ahmed"));
        System.out.println();

        /*
        Given the following String input
        String input = "   amig os cod e  "
        Write a method that transforms input into: Amigoscode
        */
        String inputo = "   amig os cod e  ";
        System.out.println(transformExampleTwo(inputo));
        System.out.println();

        /*
        Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
        */
        String[] tryoooo = {"hello", "bingo", "ola", "bye", "ciao"};
        System.out.println(longestStringInArray(tryoooo));

    }
}

