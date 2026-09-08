class MyThread extends Thread {
    public MyThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running, Count: " + i);
            try {
                // Pause for 400 milliseconds to observe context switching
                Thread.sleep(400); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
        System.out.println(getName() + " has finished executing.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        System.out.println("Starting threads...");
        
        // start() calls the run() method internally on a new execution thread
        t1.start();
        t2.start();
    }
}
