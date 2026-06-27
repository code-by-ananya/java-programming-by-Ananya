public class TrafficSignals extends Thread {

    @Override
    public void run() {
        System.out.printf("%s active \n", color);
        try {
            Thread.sleep(color.getOntimeinmills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s inactive\n", color);
    }

    private final TrafficColor color;

    public TrafficSignals(TrafficColor color) {
        this.color = color;
    }

}


