public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(5000);

    private final int ontimeinmills;

    public int getOntimeinmills() {
        return ontimeinmills;
    }

    TrafficColor(int ontimeinmills) {
        this.ontimeinmills = ontimeinmills;
    }

}
