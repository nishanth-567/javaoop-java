import java.util.Scanner;
class Addition {
    public int add(int a, int b) {
        return a + b;
    }
}

class Subtraction extends Addition {
    public int subtract(int a, int b) {
        return a - b;
    }
}

class MultiplicationDivision extends Subtraction {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 2;

        MultiplicationDivision calculator = new MultiplicationDivision();

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Result (Addition): " + calculator.add(num1, num2));
        System.out.println("Result (Subtraction): " + calculator.subtract(num1, num2));
        System.out.println("Result (Multiplication): " + calculator.multiply(num1, num2));
        System.out.println("Result (Division): " + calculator.divide(num1, num2));
    }
}