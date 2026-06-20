import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Reverse {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,5,7,6,2);
        System.out.println(list);
        reverseList(list);
        System.out.println(list);
    }

    public static void reverseList(List<Integer>list){
        Collections.reverse(list);
    }
}
