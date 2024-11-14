import java.util.Scanner;

public class Calculator {

    public double add(int a, int b) {
        return a + b;
    }

    public double subtract(int a, int b) {
        return a - b;
    }

    public double multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return (double) a / b;

    }

    public double calculate(int first, String operator, int second) {
        if (operator.equals("+")) {
            return add(first, second);
        }
        if (operator.equals("-")) {
            return subtract(first, second);
        }
        if (operator.equals("*")) {
            return multiply(first, second);
        }
        if (operator.equals("/")) {
            return divide(first, second);
        }
        return -1;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int first = Integer.parseInt(args[0]);
        String operation = args[1];
        int second = Integer.parseInt(args[2]);

        System.out.println(calc.calculate(first, operation, second));


        }
}

