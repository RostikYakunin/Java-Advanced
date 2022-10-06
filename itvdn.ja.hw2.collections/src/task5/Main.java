package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean temp = true;

        System.out.println("Input strings");
        System.out.println("Input <<end>> if you want to exit, and see all your string");
        while (temp) {
            String str = in.nextLine();
            if (str.equals("end")) {
                temp = false;
                break;
            }
            list.add(str);
        }
        System.out.println("All your strings : " + list);
    }
}