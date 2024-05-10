public class ThreadMethods extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                System.out.println("Thread is going to sleep");
                Thread.sleep(1000);
                System.out.println("Thread woke up");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods myThread = new ThreadMethods();

        // Thread state before starting
        System.out.println("Thread State 1: " + myThread.getState());

        // Start the Thread
        myThread.start();
        System.out.println("Thread State 2: " + myThread.getState());
        
        // Thread state after starting but before sleep
        Thread.sleep(1000); // Sleep for 1 second
        System.out.println("Thread State 3: " + myThread.getState());

        // Sleep for a while to let the thread finish execution
        Thread.sleep(2000); // Sleep for 2 seconds

        // Thread state after sleep
        System.out.println("Thread State after sleep: " + myThread.getState());
        
        // checking if Thread is alive
        System.out.println("Is Thread alive? " + myThread.isAlive());

        // joining of Threads
        myThread.join();
        System.out.println("Thread State after joining: " + myThread.getState());

        // checking if a Thread is alive
        System.out.println("Is Thread alive? " + myThread.isAlive());

        // interrupting a Thread
        myThread.interrupt();

        // setting and getting Thread name
        System.out.println("Thread Name: " + myThread.getName());
        myThread.setName("Rhea's Thread");
        System.out.println("New Thread Name: " + myThread.getName());

        // setting and getting Thread priority
        System.out.println("Thread Priority: " + myThread.getPriority());
        myThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("New Thread Priority: " + myThread.getPriority());

        // setting and getting Thread daemon status
        System.out.println("Is Thread a daemon? " + myThread.isDaemon());
        myThread.setDaemon(true);
        System.out.println("Is Thread a daemon now? " + myThread.isDaemon());

        // Thread state after all operations
        System.out.println("Thread State after all operations: " + myThread.getState());
    }
}
