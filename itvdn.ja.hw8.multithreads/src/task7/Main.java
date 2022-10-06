package task7;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Item item = new Item(0);

        Thread thread1 = new Thread(new Thread1(item));
        Thread thread2 = new Thread(new Thread2(item));

        thread1.setName("Class Thread1");
        thread2.setName("Class Thread2");

        thread1.start();
        thread2.start();


    }
}
