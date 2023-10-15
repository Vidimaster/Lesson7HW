package calculator;



public class LogCalculatorComplex implements CalculableComplex {
    private Logable logger;
    private CalculableComplex calculatorComplex;

    public LogCalculatorComplex(CalculableComplex calculatorComplex, Logable logger) {
        this.logger = logger;
        this.calculatorComplex = calculatorComplex;
    }

    @Override
    public CalculableComplex add(int[] arr2) {
        int[] arr = calculatorComplex.toStringResult();
        logger.log(String.format("Сложение старого значения %d %di с новым %d %di",
                arr[0], arr[1], arr2[0], arr2[1]));
        return  calculatorComplex.add(arr2);
    }

    @Override
    public CalculableComplex substract(int[] arr2) {
        int[] arr = calculatorComplex.toStringResult();
        logger.log(String.format("Вычитание старого значения %d %di на новое %d %di",
                arr[0], arr[1], arr2[0], arr2[1]));
        return  calculatorComplex.substract(arr2);
    }

    @Override
    public CalculableComplex multiply(int[] arr2) {
        int[] arr = calculatorComplex.toStringResult();
        logger.log(String.format("Умножение старого значения %d %di на новое %d %di",
                arr[0], arr[1], arr2[0], arr2[1]));
        return  calculatorComplex.multiply(arr2);
    }

    @Override
    public CalculableComplex divide(int[] arr2) {
        int[] arr = calculatorComplex.toStringResult();
        logger.log(String.format("Деление старого значения %d %di на новое %d %di",
                arr[0], arr[1], arr2[0], arr2[1]));
        return  calculatorComplex.divide(arr2);
    }



    @Override
    public int[] toStringResult() {
        return  calculatorComplex.toStringResult();
    }


}
