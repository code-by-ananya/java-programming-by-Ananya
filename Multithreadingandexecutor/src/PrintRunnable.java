public class PrintRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d%c ",i,targetchar);
        }
        System.out.printf("\n %c task done \n",targetchar);
    }
    private final char targetchar;
    public PrintRunnable(char targetchar) {
        this.targetchar = targetchar;
    }

    public static void main(String[] args) {
        PrintRunnable t1 = new PrintRunnable('#');
        new Thread(t1).start();
        PrintRunnable t2 = new PrintRunnable('*');
        new Thread(t2).start();
    }
}
