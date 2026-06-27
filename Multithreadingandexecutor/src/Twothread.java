public class Twothread extends Thread{


   @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hello from Thread%d \n", threadnum);
        }
    }

        private final int threadnum;
        public Twothread(int threadnum){
            this.threadnum = threadnum;
        }

    public static void main(String[] args) {
        Twothread t1 = new Twothread(1);
        Twothread t2 = new Twothread(2);
        t1.start();
        t2.start();
    }
}
