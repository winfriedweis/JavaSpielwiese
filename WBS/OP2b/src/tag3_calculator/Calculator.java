package tag3_calculator;

public class Calculator {
    public int calculate(int a, int b, Operation operation) {
        return operation.execute(a, b);
    }
}
