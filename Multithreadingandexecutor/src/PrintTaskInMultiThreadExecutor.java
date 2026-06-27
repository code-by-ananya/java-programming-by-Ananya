import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PrintTaskInMultiThreadExecutor implements Runnable {





    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ", i, targetchar);
        }
        System.out.printf("\n %s %c task complete",
                Thread.currentThread().getName(),
                targetchar);
//        System.out.printf("\n %c task done \n", targetchar);
    }

    private final char targetchar;

    public PrintTaskInMultiThreadExecutor(char targetchar) {
        this.targetchar = targetchar;
    }


public static void main(String[] args) throws InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(3);

    for (int i = 0; i < 10; i++) {
        PrintTaskInMultiThreadExecutor task = new PrintTaskInMultiThreadExecutor('*');
        PrintTaskInMultiThreadExecutor task2 = new PrintTaskInMultiThreadExecutor('#');
        executor.submit(task);
        executor.submit(task2);
    }
    executor.shutdown();
    System.out.println("&&&&&&&&&\n");
    if (!executor.awaitTermination(20, TimeUnit.SECONDS)){
        System.out.println("**********\n");
        executor.shutdownNow();
    }
}}

