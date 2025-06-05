public class Wait_Notify {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1 waiting");
                try {
                    lock.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 resumed");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 notifying");
                lock.notify();
            }
        });
        t1.start();
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    } 
}
