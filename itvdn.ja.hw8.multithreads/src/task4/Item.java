package task4;

public class Item {
    public int id = 0;

    public synchronized void methodGet () throws InterruptedException {
      while (id < 1) {
          wait();
      }
      id--;
        System.out.println("Поток " + Thread.currentThread().getName());
        notify();
    }

    public synchronized void methodSet () throws InterruptedException {
        while (id>=1) {
            wait();
        }
        id++;
        System.out.println("Поток " + Thread.currentThread().getName());
        notify();
    }



}
