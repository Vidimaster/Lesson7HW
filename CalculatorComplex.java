package calculator;

public class CalculatorComplex implements CalculableComplex  {

   private int arr[] = new int[2];

    public CalculatorComplex(int[] arr) {
        this.arr[0] = arr[0];
        this.arr[1] = arr[1];
    }

    @Override
    public CalculatorComplex add(int[] arr2) {
        arr[0] += arr2[0];
        arr[1] += arr2[1];
        return this;
    }
    @Override
    public CalculatorComplex substract(int[] arr2) {
        arr[0] -= arr2[0];
        arr[1] -= arr2[1];
        return this;
    }
    @Override
    public CalculatorComplex multiply(int[] arr2) {
        int real3 = arr[0] * arr2[0] - arr[1] * arr2[1];
        int image3 = arr[0] * arr2[1] + arr[1] * arr2[0];
        arr[0] = real3;
        arr[1] = image3;
        return this;
    }
    @Override
    public CalculatorComplex divide(int[] arr2) {
        int real3 = (arr[0] * arr2[0] + arr[1] * arr2[1]) / ( arr2[0] * arr2[0]  + arr2[1] * arr2[1]);
        int image3 =(arr[0] * arr2[0] - arr[0] * arr2[1]) / (arr2[0] * arr2[0]  + arr2[1] * arr2[1]);
        arr[0] = real3;
        arr[1] = image3;
        return this;
    }

    @Override
    public int[] toStringResult() {
        return arr;
    }

}