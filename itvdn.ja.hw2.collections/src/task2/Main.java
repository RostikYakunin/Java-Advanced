package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String doubleValues (String str){
        str += ", " + str;
        return str;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String str;

        for (int i = 0, j=1; i < 5; i++) {
            System.out.println("Input " + j++ +"-th" + " word:");
            list.add(str = in.nextLine());
        }

        System.out.println("Output all double words:");
        for (String s : list) {
            System.out.println(doubleValues(s));
        }
    }
}
