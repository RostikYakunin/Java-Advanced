package task4;

public class Animal {
    private String name;
    protected int age;
    int numbersOfPaw;

    public Animal(String name, int age, int numbersOfPaw) {
        this.name = name;
        this.age = age;
        this.numbersOfPaw = numbersOfPaw;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numbersOfPaw=" + numbersOfPaw +
                '}';
    }
}
