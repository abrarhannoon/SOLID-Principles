package implement.OperationCalc;

import Interface.calculatable;
import implement.Calculator;


public class Addition extends Calculator implements calculatable {

    @Override
    public Integer calculate(Calculator calculator) {
        int result = 0;
        for (Integer number : calculator.getNumbers()) {
            result += number;
        }

        return  result;
        }


}
