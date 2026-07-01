import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        System.out.println(Optionalstring(null));
        System.out.println(Optionalstring("  "));
        System.out.println(Optionalstring("pop"));
    }
    public static Optional<String> Optionalstring(String str){
        if (str == null || str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
