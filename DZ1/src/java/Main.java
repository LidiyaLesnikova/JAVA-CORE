import Handlers.Calculator;
import Handlers.PrintObject;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        PrintObject printObject = new PrintObject();
        int a = 6;
        int b = 2;
        System.out.println(printObject.output(a,b,"+", calculator.summ(a,b)));
        System.out.println(printObject.output(a,b,"-", calculator.diff(a,b)));
        System.out.println(printObject.output(a,b,"*", calculator.multiply(a,b)));
        System.out.println(printObject.output(a,b,"/", calculator.dividing(a,b)));
    }
}
