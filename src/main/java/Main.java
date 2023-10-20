import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a command (add, subtract, multiply, divide, fibonacciNumberFinder, intToBinaryNumber):");

        while (true) {
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");

            if (inputs.length < 2) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            String command = inputs[0];
            int num1 = 0;
            int num2 = 0;

            try {
                num1 = Integer.parseInt(inputs[1]);
                if (inputs.length > 2) {
                    num2 = Integer.parseInt(inputs[2]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers.");
                continue;
            }

            switch (command) {
                case "add":
                    System.out.println(calculator.add(num1, num2));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(num1, num2));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(num1, num2));
                    break;
                case "divide":
                    if (num2 != 0) {
                        System.out.println(calculator.divide(num1, num2));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(num1));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(num1));
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        }
    }
}