import java.util.HashMap;
import java.util.Map;

class Calculator {

    Calculator() {

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input. n should be a positive integer.");
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int fib1 = 1;
        int fib2 = 1;
        int fibonacci = 0;
        for (int i = 3; i <= n; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }

    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int number) {
        return Integer.toBinaryString(number);
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    private Map<String, Integer> uniqueIdCounter = new HashMap<>();

    String createUniqueID(String n) {
        if (!uniqueIdCounter.containsKey(n)) {
            uniqueIdCounter.put(n, 1);
        } else {
            int count = uniqueIdCounter.get(n);
            uniqueIdCounter.put(n, count + 1);
        }
        int count = uniqueIdCounter.get(n);
        return n + "uniqueID" + count;
    }



}
