public class Threadjoin implements Runnable{
    @Override
    public void run() {
        System.out.printf("%c task started\n",targetchar);
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d %c \n",i,targetchar);
        }
        System.out.printf("%c task end \n",targetchar);
    }
    private final char targetchar;

    public Threadjoin(char targetchar) {
        this.targetchar = targetchar;
    }

    public static void main(String[] args)throws InterruptedException {
        Threadjoin t1 = new Threadjoin('#');
//        new Thread(t1).join();
        new Thread(t1).start();
        new Thread(t1).join();
        Threadjoin t2 = new Threadjoin('&');
        new Thread(t2).join();
        new Thread(t2).start();
        new Thread(t2).join();
        Threadjoin t3 = new Threadjoin('*');
        new Thread(t3).join();
        new Thread(t3).start();
        new Thread(t3).join();
    }
}
