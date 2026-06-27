import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class MultiplicationUsingLambda {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (a,b) -> a * b;
        int result = multiply.apply(3,5);
        System.out.println(result);

    }
}
