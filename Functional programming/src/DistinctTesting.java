import java.util.List;
import java.util.stream.Collectors;

public class DistinctTesting {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,1,4,6,7,3);
        List<Integer> listnum = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listnum);
    }
}
