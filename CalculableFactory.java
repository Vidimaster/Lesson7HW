package calculator;

public class CalculableFactory implements ICalculableFactory {



    public CalculableComplex create(int[] arr) {

        return new CalculatorComplex(arr);
    }
}
