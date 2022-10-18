package implement;



public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.addNumber(1);
        calculator.addNumber(3);
        calculator.addNumber(5);
        calculator.addNumber(2);
        calculator.addNumber(9);
        calculator.addNumber(1);

        System.out.println("implement.Operation.Addition " + calculator.getOperationResult(Operation.Addition));
        System.out.println("implement.Operation.Multiplication " + calculator.getOperationResult(Operation.Multiplication));
        System.out.println("implement.Operation.Count " + calculator.getOperationResult(Operation.Count));
        System.out.println("implement.Operation.Max " + calculator.getOperationResult(Operation.Max));
        System.out.println("implement.Operation.Min " + calculator.getOperationResult(Operation.Min));

    }
}
