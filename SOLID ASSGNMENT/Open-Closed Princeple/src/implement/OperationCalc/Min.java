package implement.OperationCalc;
import implement.Calculator;
import Interface.calculatable;


public class Min extends Calculator implements calculatable {

    @Override
    public Integer calculate(Calculator calculator) {

        int min = Integer.MAX_VALUE;
        for (Integer number :calculator.getNumbers() ) {
            if (min > number){
                min = number;
            }
        }

      return  min;
    }
}
