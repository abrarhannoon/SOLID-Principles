package implement.OperationCalc;
import implement.Calculator;
import Interface.calculatable;

public class Max extends Calculator implements calculatable {

    @Override
    public Integer calculate(Calculator calculator) {
        int max = Integer.MIN_VALUE;
        for (Integer number : calculator.getNumbers()) {
            if (max < number){
                max = number;
            }
        }
        return max;
    }
}
