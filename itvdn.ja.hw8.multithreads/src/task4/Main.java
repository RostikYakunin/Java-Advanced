package task4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Item item = new Item();
        Thread tr1 = new Thread(new Therad1(item));
        Thread tr2 = new Thread(new Therad2(item));

        tr1.setName("Thread #1");
        tr2.setName("Thread #2");

        tr1.start();
        tr2.start();
    }
}
