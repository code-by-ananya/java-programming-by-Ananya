public interface Candidate {
    boolean isCanditade(int num);


    public class TestingfunctionalInteface {
        public static void main(String[] args) {
            Candidate candidate = num -> {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            };
            System.out.println(candidate.isCanditade(6));
        }
    }
}
