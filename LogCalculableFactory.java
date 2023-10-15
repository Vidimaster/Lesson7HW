package calculator;

public class LogCalculableFactory implements ICalculableFactory {

    private Logable logger;

    public LogCalculableFactory(Logable logger) {
        this.logger = logger;
    }


    @Override
    public CalculableComplex create(int[] arr) {
        return new LogCalculatorComplex(new CalculatorComplex(arr), logger);
    }
}
