public class PrintTaskByThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d%c ",i,targetchar);
        }
        System.out.printf("\n %c task done \n",targetchar);
    }
    private final char targetchar;
    public PrintTaskByThread(char targetchar) {
        this.targetchar = targetchar;
    }


public static void main(String[] args) {
    PrintTaskByThread t1 = new PrintTaskByThread('*');
    t1.start();
    PrintTaskByThread t2 = new PrintTaskByThread('$');
    t2.start();
}
}

