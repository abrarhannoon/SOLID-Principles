package implement.OperationCalc;
import implement.Calculator;
import Interface.calculatable;


public class Multiplication extends Calculator implements calculatable {

    @Override
    public Integer calculate(Calculator calculator) {
        int result = 1;
        for (Integer number : calculator.getNumbers()) {
            result *= number;
        }
        return result;
    }
}