public class Course {
    String courseName;
    int enrolledStudent;
    static int maxStudent = 50;
    String[] enrollStudent;


    Course(String courseName){
        this.courseName = courseName;
        this.enrolledStudent = 0;
        this.enrollStudent = new String[maxStudent];
    }

    String[] enrolled = new String[maxStudent];

    static void setMaxCapacity(int maxCapacity){
        Course.maxStudent = maxCapacity;
    }

    void setEnrolledStudent(String studentName){
        enrolled[enrolledStudent] = studentName;
        enrolledStudent++;
    }

    void unenrolledStudent(String studentName){
        System.out.println("student removed");
        enrolledStudent--;
    }
}
