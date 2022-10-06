package task7;

public class Item {
    public int id;

    public Item(int id) {
        this.id = id;
    }

    public synchronized void methodDown() throws InterruptedException {
        if (id < 1) {
            System.out.println(Thread.currentThread().getName() + " жду ! ");
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " берусь за работу ! ");
        id--;
        notify();
    }

    public synchronized void methodUp() throws InterruptedException {

        if (id >= 1) {
            System.out.println(Thread.currentThread().getName() + " жду ! ");
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " берусь за работу ! ");
        id++;
        notify();
    }
}
