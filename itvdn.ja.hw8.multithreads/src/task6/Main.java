package task6;

public class Main {
    public static void main(String[] args) throws InterruptedException {

            Item item = new Item(1);

            Thread thread = new Thread(new RunnableImpl(item));
            thread.setName("RunnableImpl " + item.getId());

            Thread threadExt = new Thread(new ThreadExt(item));
            threadExt.setName("ThreadExt " + item.getId());

            thread.start();
            threadExt.start();




    }
}
