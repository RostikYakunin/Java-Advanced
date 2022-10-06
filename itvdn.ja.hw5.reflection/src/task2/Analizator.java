package task2;

import java.lang.reflect.*;
import java.util.Arrays;

public class Analizator {

    public Analizator(Class<?> aClass) {
        vievInfo(aClass);
    }

    public void vievInfo (Class<?> aClass) {

        Field[] fields = aClass.getDeclaredFields();
        Constructor<?>[] constructors = aClass.getDeclaredConstructors();
        Method[] methods = aClass.getDeclaredMethods();
        Class<?>[] interfaces = aClass.getInterfaces();
        Class<?> superClass  = aClass.getSuperclass();

        System.out.println("\nInfo about fields");
        infoOfClass(fields);

        System.out.println("\nInfo about constructors");
        infoOfClass(constructors);

        System.out.println("\nInfo about methods");
        infoOfClass(methods);

        System.out.println("\nInfo about interfaces");
        System.out.println(Arrays.toString(interfaces));

        System.out.println("\nInfo about super classes");
        System.out.println(superClass);
    }

    private void infoOfClass (Member[] members) {
        for (Member m:members) {
            System.out.println(m);
        }
    }
}
