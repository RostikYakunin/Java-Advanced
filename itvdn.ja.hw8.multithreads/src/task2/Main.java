package task2;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Start MainThread with name " + Thread.currentThread().getName());

                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    System.out.println("Что-то не так");;
                }

                System.out.println("Finish MainThread with name " + Thread.currentThread().getName());
            }
        };

        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());

        thread.start();
        firstThread.start();
        secondThread.start();

    }
}