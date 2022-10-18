package implement;

import Abstract.OperationFactory;
import Interface.calculatable;

import java.util.ArrayList;
public class Calculator {

  private ArrayList<Integer> numbers;
    public calculatable calculatable;

    public Calculator(){
        numbers = new ArrayList<>();
        calculatable=null;
    }

    public ArrayList<Integer> getNumbers() {
        return this.numbers;
    }



    public void addNumber(int number){
        numbers.add(number);
    }

    public void removeNumberAtIndex(int index){
        if (index < 0 || index >= numbers.size()){
            System.out.println("Invalid number: " + index);
            return;
        }
        numbers.remove(index);
    }

    public Integer getOperationResult(Operation operation){
       calculatable calculatable1= OperationFactory.CreateOperation(operation);
       return calculatable1.calculate(this);

    }
}
