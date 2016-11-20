package fizzBuzz;


/**
 * Cracking the Code Interview Question.
 * 
 * Interview question as found at: https://www.youtube.com/watch?v=ltoEvkDdUR8
 * 
 * Go from 1 to 100, and if divisible by 3, Log Fizz, and if divisible by 5, Log Buzz.
 * 
 * @author Andy Dao, uID: u0692334
 */
public class FizzBuzz {
    public static void main(String[] args) {
        // Go from 1 to 100
        for (int i = 1; i <= 100; i++) {
            String result = "";
            if (i % 3 == 0) { // If divisible by 3
                result += "Fizz";
            }
            if (i % 5 == 0) { // If divisible by 5
                result += "Buzz";
            }
            // If it was divisible by either 3 or 5 (or both), print Fizz, Buzz, or FizzBuzz
            // accordingly.
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(result);
            } else { // Or else just print the integer
                System.out.println(i);
            }
        }
    }

    // Alternative version using % 15
    // public static void main(String[] args) {
    // for (int i = 1; i <= 100; i++) {
    // if (i % 15 == 0) {
    // System.out.println("FizzBuzz");
    // } else if (i % 3 == 0) {
    // System.out.println("Fizz");
    // } else if (i % 5 == 0) {
    // System.out.println("Buzz");
    // } else {
    // System.out.println(String.valueOf(i));
    // }
    // }
    // }

}
