package task4;

public class Therad2 implements Runnable{

    Item item = new Item();

    public Therad2 (Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                item.methodGet();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
