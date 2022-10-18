package Abstract;

import Interface.calculatable;
import implement.Operation;
import implement.OperationCalc.*;

public abstract class OperationFactory {

    public static calculatable CreateOperation(Operation operation){
        calculatable calculatable=null;
        switch (operation){
            case Count:
                calculatable=new Count();
                return calculatable;
            case Multiplication:
                calculatable=new Multiplication();
                return calculatable;
            case Max:
                calculatable=new Max();
                return calculatable;
            case Min:
                calculatable=new Min();
                return calculatable;
            case Addition:
                calculatable=new Addition();
                return calculatable;
        }

        System.err.println("Invalid operation");
        try {
            return calculatable;
        } catch (NullPointerException e){
            System.err.println("Null exception thrwon in create operation");
        }
        return calculatable;
    }



}
