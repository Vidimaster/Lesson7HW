package calculator;

import java.util.ArrayList;
import java.util.List;

public class ConsoleLogger implements Logable {
    @Override
    public void log(String message) {
        System.out.println(" LOG :  " + message);
    }


}
