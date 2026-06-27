public class PrirorityTest extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d%c ",i,targetchar);
        }
        System.out.printf("\n %c task done \n",targetchar);
    }
    private final char targetchar;
    public PrirorityTest(char targetchar) {
        this.targetchar = targetchar;
    }

    public static void main (String[] args) throws InterruptedException {
        PrirorityTest t1 = new PrirorityTest('*');
        t1.setPriority(MIN_PRIORITY);
        t1.join();
        PrirorityTest t2 = new PrirorityTest('$');
        t2.setPriority(MAX_PRIORITY);
        t1.start();
        t2.start();

    }
}

