package task2;

public class SecondThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Start SecondThread with name " + Thread.currentThread().getName());

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            System.out.println("Что-то не так");;
        }

        System.out.println("Finish SecondThread with name " + Thread.currentThread().getName());
    }

}
