public enum DaysWithType {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THRUSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekday;

    DaysWithType(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "weekday" : "weekend";
    }
}
