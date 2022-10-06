package task3;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Start MainThread with name " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Что-то не так");;
                }

                System.out.println("Finish MainThread with name " + Thread.currentThread().getName());
            }
        };

        Thread priorityThread = new Thread(new PriorityThread());
        Thread priorityRunner = new Thread(new PriorityRunner());

        thread.setPriority(5);
        priorityRunner.setPriority(1);
        priorityThread.setPriority(10);


        thread.start();
        priorityRunner.start();
        priorityThread.start();


        for (int i = 0; i < 50; i++) {
            System.out.println(i + ", " + Thread.currentThread().getName());
        }

    }
}
