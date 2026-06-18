import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,3,2,5,4,7);
        System.out.println(Collections.frequency(list,2));
        System.out.println(Collections.frequency(list,3));
        System.out.println(Collections.frequency(list,4));
    }
}
