package day1;

import java.util.Scanner;

public class SimpleCalculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Console Calculator");

        System.out.print("Enter first number: ");
        double firstNum = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNum = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                System.out.println("Result: " + add(firstNum, secondNum));
                break;
            case "-":
                System.out.println("Result: " + subtract(firstNum, secondNum));
                break;
            case "*":
                System.out.println("Result: " + multiply(firstNum, secondNum));
                break;
            case "/":
                try {
                    double result = divide(firstNum, secondNum);
                    System.out.println("Result: " + result);
                } catch (IllegalArgumentException exception) {
                    System.out.println(exception.getMessage());
                }

                break;
            default:
                System.out.println("Unknown operator");
        }
        scanner.close();
    }
}