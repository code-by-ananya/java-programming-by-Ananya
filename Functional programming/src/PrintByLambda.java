import java.util.List;

public class PrintByLambda {
    public static void main(String[] args) {
        List<String> s = List.of("Ram", "Shyam","Gita","Sita");

        s.stream()
                .forEach(S -> System.out.println(S));
    }
}
