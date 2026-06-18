import java.util.Arrays;
import java.util.List;

public class Swapping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,7,8);
        System.out.println(list);
        Swap(list,1,4);
        System.out.println(list);
    }

    public static void Swap(List<Integer>list,int x,int y){
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y,swap);
    }
}
