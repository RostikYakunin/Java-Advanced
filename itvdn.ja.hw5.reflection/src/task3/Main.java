package task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class <?> dogClass = Dog.class;

        Field [] fields = dogClass.getDeclaredFields();
        Constructor<?>[] constructors = dogClass.getDeclaredConstructors();
        Method [] methods = dogClass.getDeclaredMethods();

        System.out.println("\nInfo about fields");
        infoOfClass(fields);

        System.out.println("\nInfo about constructors");
        infoOfClass(constructors);

        System.out.println("\nInfo about methods");
        infoOfClass(methods);

    }

    public static void infoOfClass (Member [] members) {
        for (Member m:members) {
            System.out.println(m);
        }
    }
}
