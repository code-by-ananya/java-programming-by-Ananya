import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<student>queue = new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
               // int value = o1.getGrade()-o2.getGrade();
                return 0;
            }
        });
        queue.offer(new student("Ram","B"));
        queue.offer(new student("shyam","C"));
        queue.offer(new student("Mohan","A"));
        System.out.printf("Queue is %s",queue);
        System.out.printf("got %s \n",queue.poll());
    }
    private static class student{
        private final String name;
        private final String grade;

        public student(String name, String grade ) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public String getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ":"+grade;
        }
    }
}
