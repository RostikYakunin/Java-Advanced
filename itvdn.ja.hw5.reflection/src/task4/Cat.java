package task4;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Cat {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal("Pes", 12, 4);
        System.out.println("Animal before " + animal);

        Class<Animal> animalClass = Animal.class;

        Field [] fields = animalClass.getDeclaredFields();
        System.out.println("Name of fields = " + Arrays.toString(fields));

        Field name = animalClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(animal, "Koshak");

        Field age = animalClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(animal, 15);

        Field numbers = animalClass.getDeclaredField("numbersOfPaw");
        numbers.setAccessible(true);
        numbers.set(animal, 3);

        System.out.println("Animal after = " + animal);
    }
}
