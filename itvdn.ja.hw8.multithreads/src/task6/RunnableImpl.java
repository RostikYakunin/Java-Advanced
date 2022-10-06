package task6;

public class RunnableImpl implements Runnable {

    private Item item ;

    public RunnableImpl(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        synchronized (item){
            System.out.println(Thread.currentThread().getName() + ", " + item.getId());
            item.id ++;
            try {
                    System.out.println(Thread.currentThread().getName() + "Жду");
                    wait();
                
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "Отдаю работу другому потоку");
            notify();
        }
    }
}
