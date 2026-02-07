public class Student {
    String  name;
    int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studentdetails{name:"+ name  +" , age:"+age+" }";
    }

    public static void main(String[] args) {
        Student details = new Student(19,"Ananya");
        System.out.println(details);
    }


}
