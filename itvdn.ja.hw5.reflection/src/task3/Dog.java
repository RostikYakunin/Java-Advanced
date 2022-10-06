package task3;

public class Dog {
    private String name;
    private int age;
    private int numbersOfPaw;

    public Dog(String name, int age, int numbersOfPaw) {
        this.name = name;
        this.age = age;
        this.numbersOfPaw = numbersOfPaw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumbersOfPaw() {
        return numbersOfPaw;
    }

    public void setNumbersOfPaw(int numbersOfPaw) {
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
