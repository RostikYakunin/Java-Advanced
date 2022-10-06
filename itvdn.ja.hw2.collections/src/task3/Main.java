package task3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static Integer getMinimum (LinkedList <Integer> list){
        Integer temp = 0;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)> list.get(i+1)) {
                temp = list.get(i + 1);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        System.out.println("Select numbers of integer to enter:");
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        System.out.println("Input " + temp + " numbers: ");

        for (int i = 0; i < temp; i++) {
            list.add(Integer.valueOf(in.next()));
        }

        System.out.println("All your inputs numbers: " + list);
        System.out.println("Min value of your numbers " + getMinimum(list));
    }
}
