package task7;

public class Thread1 implements Runnable {

    private final Item item;

    public Thread1(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {

            try {
                item.methodUp();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
