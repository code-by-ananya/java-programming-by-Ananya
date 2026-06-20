public class PrintingDays {
    public static void main(String[] args) {
        System.out.println("printing all the day: ");

        for (Day day: Day.values()){
            System.out.println(day);
        }
        for (DaysWithType day: DaysWithType.values()){
            System.out.printf("%s : %s \n",day , day.getType());
        }
        }
}
