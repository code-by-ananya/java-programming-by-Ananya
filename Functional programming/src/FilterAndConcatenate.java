import java.util.List;

public class FilterAndConcatenate {
    public static void main(String[] args) {
        List<String> Strs = List.of("Ananya kumari","Ram","Learning java","Sita");
        String result = Strs.stream()
                .filter(str -> str.length()>10)
                .reduce(" ", (a,b) -> a+" "+b);
        System.out.println(result);
    }
}
