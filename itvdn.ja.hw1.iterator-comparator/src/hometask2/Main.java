package hometask2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(234);
        list.add(1231);
        list.add(426);
        list.add(67934);
        list.add(4367);
        list.add(247);
        list.add(5680);
        list.add(23457);
        list.add(7937);
        list.add(47963);

        Iterator <Integer> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}