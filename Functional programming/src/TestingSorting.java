import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("ram",100),
                new Employee("Shyam",10),
                new Employee("sita",1000),
                new Employee("gita",150)
        );
        employees.stream()
                .sorted((emp1,emp2) -> emp1.getSalary()- emp2.getSalary())
                .forEach(System.out::println);
    }
}
