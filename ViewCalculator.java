package calculator;
import java.util.*;
import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        int arr[] = new int[2];

        while (true) {
            System.out.println(("Введите первый аргумент: "));
            arr[0] = promptInt("Введите действительную часть первого комплексного числа: ");
            arr[1] = promptInt("Введите мнимую часть первого комплексного числа: ");
            CalculableComplex calculableComplex = calculableFactory.create(arr);
            while (true) {
                String cmd = prompt("Введите команду (*, /, +, -, =) : ");
                if (cmd.equals("*")) {
                    System.out.println("Введите второй аргумент: ");
                    arr[0] = promptInt("Введите действительную часть второго комплексного числа: ");
                    arr[1] = promptInt("Введите мнимую часть второго комплексного числа: ");
                    calculableComplex.multiply(arr);
                    continue;
                }
                if (cmd.equals("/")) {
                    System.out.println("Введите второй аргумент: ");
                    arr[0] = promptInt("Введите действительную часть второго комплексного числа: ");
                    arr[1] = promptInt("Введите мнимую часть второго комплексного числа: ");
                    calculableComplex.divide(arr);
                    continue;
                }
                if (cmd.equals("-")) {
                    System.out.println("Введите второй аргумент: ");
                    arr[0] = promptInt("Введите действительную часть второго комплексного числа: ");
                    arr[1] = promptInt("Введите мнимую часть второго комплексного числа: ");
                    calculableComplex.substract(arr);
                    continue;
                }
                if (cmd.equals("+")) {
                    System.out.println("Введите второй аргумент: ");
                    arr[0] = promptInt("Введите действительную часть второго комплексного числа: ");
                    arr[1] = promptInt("Введите мнимую часть второго комплексного числа: ");
                    calculableComplex.add(arr);
                    continue;
                }
                if (cmd.equals("=")) {
                    int[] result = calculableComplex.toStringResult();
                    System.out.printf("Результат %s\n", Arrays.toString(result));
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
