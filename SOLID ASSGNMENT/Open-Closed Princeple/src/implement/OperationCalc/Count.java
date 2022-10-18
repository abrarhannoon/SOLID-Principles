package implement.OperationCalc;

import Interface.calculatable;
import implement.Calculator;

public class Count extends Calculator implements calculatable {

    @Override
    public Integer calculate(Calculator calculator) {
        return calculator.getNumbers().size();
    }
}
