import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GlobeMap {
    public static void main(String[] args) {
        Map<String,String> GlobeMap = new HashMap<>();
        GlobeMap.put("India","New delhi");
        GlobeMap.put("Pakistan","Islamabad");
        GlobeMap.put("Bangladesh","Dhaka");
        GlobeMap.put("Nepal","Bhutan");
        GlobeMap.put("China","bejing");
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of the country:");
        String name = input.next();
        if (GlobeMap.containsKey(name)){
            System.out.printf("capital of %s is %s",name,GlobeMap.get(name));
        }else{
            System.out.println("country is not present");
        }
    }
}
