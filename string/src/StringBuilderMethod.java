public class StringBuilderMethod {
    public static void main(String[] args) {
        String[] arr = new String[]{"my","name","is","Ananya"};
        StringBuilder sb = new StringBuilder();
        for (String str : arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
