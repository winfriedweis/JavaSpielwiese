package tag3_calculator;

import tag3_calculator.Calculator;
import tag3_calculator.Operation;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Operation add = new Operation() {
            @Override
            public int execute(int a, int b) {
                return a + b;
            }
        };

        Operation subtract = new Operation() {
            @Override
            public int execute(int a, int b) {
                return a - b;
            }
        };

        Operation multiply = new Operation() {
            @Override
            public int execute(int a, int b) {
                return a * b;
            }
        };

        Operation divide = new Operation() {
            @Override
            public int execute(int a, int b) {
                if (b == 0) {
                    throw new ArithmeticException("Division durch 0 nicht erlaubt");
                }
                return a / b;
            }
        };

        int a = 10;
        int b = 5;

        System.out.println("Addition:       " + calculator.calculate(a, b, add));
        System.out.println("Subtraktion:    " + calculator.calculate(a, b, subtract));
        System.out.println("Multiplikation: " + calculator.calculate(a, b, multiply));
        System.out.println("Division:       " + calculator.calculate(a, b, divide));
    }
}
