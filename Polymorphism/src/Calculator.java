public class Calculator {

    private static int add(int first, int second)
    {
        return first + second;
    }

    private static int add(int first, int second,int third)
    {
        return first + second + third;
    }

    private static double add(double first, double second)
    {
        return first + second;
    }

    public static void main(String[] args) {

        System.out.println(add(2,5));
        System.out.println(add(20.7, 30.3));
        System.out.println(add(2,5,7));
    }
}
