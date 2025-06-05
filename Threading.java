class Threading {
    public static void main(String[] args) {
        System.out.println("Main thread ");

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 ");
        });

        t1.start();
        t2.start();
    }
}
