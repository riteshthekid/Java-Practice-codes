class MultiThreading {
    public static void main(String[] args) {
        System.out.println("Main thread is running");
        MyThread thread = new MyThread();
        thread.start();
    }    
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(2000); 
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Thread has finished running");
    }
}
