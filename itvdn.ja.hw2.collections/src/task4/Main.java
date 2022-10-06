package task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("If you want to know what`s family lives in the city, input city: " +
                "\nLisbon\n" +
                "London\n" +
                "Kiev\n" +
                "Vienna\n" +
                "Tokio\n" +
                "Berlin");

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Lisbon", "Pupkins");
        hashMap.put("London", "Smith");
        hashMap.put("Kiev", "Stepanenko");
        hashMap.put("Vienna", "Frolen");
        hashMap.put("Tokio", "Chan");
        hashMap.put("Berlin", "Shvartz");

        System.out.println("Input city:");
        String temp = in.next();

        for (Map.Entry<String, String> a: hashMap.entrySet()) {
            if (a.getKey().equals(temp)) System.out.println("Family of : " + a.getValue());
        }



    }
}
