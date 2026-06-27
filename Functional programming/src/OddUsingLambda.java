import java.util.List;

public class OddUsingLambda {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,5,6,7,8,9);
        num.stream()
                .filter(nums -> nums % 2 == 1)
                .forEach(nums -> System.out.println(nums));
    }

        }



