import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorClass {
    public static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d ", i);
            }
            System.out.printf("\n %s %c task complete",
                    Thread.currentThread().getName(),
                    targetchar);
//            System.out.printf("\n %c task done \n", targetchar);
        }

        private final String targetchar;

        public PrintRunnable(String targetchar) {
            this.targetchar = targetchar;
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runnable task = new PrintRunnable("counting");
        executor.submit(task);
        executor.shutdown();
    }
}

