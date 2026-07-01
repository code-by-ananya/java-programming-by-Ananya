import java.util.stream.IntStream;

public class FactorialTesting {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(StructFactorial(n));

        IntStream.rangeClosed(2,n)
                .reduce((a, b) -> a * b)
        .ifPresent(System.out::println);

    }

    public static Long StructFactorial(int num){
        if (num == 0 || num == 1){
            return 1L;
        }
        long fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
