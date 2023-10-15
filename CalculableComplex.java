package calculator;

public interface CalculableComplex {

    CalculableComplex add(int[] arr);
    CalculableComplex substract(int[] arr);
    CalculableComplex multiply(int[] arr);
    CalculableComplex divide(int[] arr);

    int[] toStringResult();
}
