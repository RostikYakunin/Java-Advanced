package hometask3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "Red", 170, 2500);
        Car c2 = new Car("FORD", "White", 180, 4760);
        Car c3 = new Car("MG", "Black", 196, 1000);

        Car[] c = {c1, c2, c3};

        Arrays.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
