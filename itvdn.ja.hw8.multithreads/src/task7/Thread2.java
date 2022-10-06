package task7;

public class Thread2 implements Runnable {

    private final Item item;

    public Thread2(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {

            try {
                item.methodDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
