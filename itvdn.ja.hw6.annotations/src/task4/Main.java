package task4;

import java.lang.reflect.Method;

public class Main {


    @MyAnnotation (
            value1 = 10,
            value2 = 30)
    public void sum (int value1, int value2){
        System.out.println("Sum = " + (value1 + value2));
    }

    public static void main(String[] args) throws IllegalAccessException {
        Main main = new Main();

        for (Method m : main.getClass().getDeclaredMethods()) {
            if (m.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
                main.sum(myAnnotation.value1(), myAnnotation.value2());
            }
        }
    }
}
