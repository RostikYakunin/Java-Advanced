package task3;

public class PriorityRunner implements Runnable {
    @Override
    public void run() {
        System.out.println("Start PriorityRunner with name " + Thread.currentThread().getName());

        for (int i = 0; i < 50; i++) {
            System.out.println(i + ", " + Thread.currentThread().getName());
        }

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            System.out.println("Что-то не так");;
        }

        System.out.println("Finish PriorityRunner with name " + Thread.currentThread().getName());
    }
}
