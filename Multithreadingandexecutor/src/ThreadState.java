public class ThreadState extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.printf("from inside run %s",Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("\n created the thread %s ",t1.getState());
        t1 .start();
        t1.join();
        System.out.printf("\n thread finished %s ",t1.getState());
    }
}
