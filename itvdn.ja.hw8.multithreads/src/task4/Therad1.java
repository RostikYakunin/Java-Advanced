package task4;

public class Therad1 implements Runnable{

    public  Item item;

    public Therad1(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                item.methodSet();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
