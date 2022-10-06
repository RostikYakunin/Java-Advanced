package task6;

public class ThreadExt implements Runnable{

    Item item;

    public ThreadExt (Item item) {
        this.item = item;
    }

    @Override
    public void run() {

        synchronized (item) {
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
