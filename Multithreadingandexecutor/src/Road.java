public class Road {
    public static void main(String[] args) throws InterruptedException{
        TrafficSignals red = new TrafficSignals(TrafficColor.RED);
        TrafficSignals yellow = new TrafficSignals (TrafficColor.YELLOW);
        TrafficSignals green = new TrafficSignals (TrafficColor.GREEN);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
        red.join();
    }
}

