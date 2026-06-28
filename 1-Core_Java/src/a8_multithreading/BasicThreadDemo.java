package a8_multithreading;

/**
 * Creating Threads using:
 * 1. Thread class
 * 2. Runnable interface
 */

// Method 1: Extending the Thread class.
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Thread Class) is running.");
    }

}


// Method 2: Implementing the Runnable interface.
class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Runnable Interface) is running.");
    }

}

public class BasicThreadDemo {

    public static void main(String[] args) {

        System.out.println("Creating Threads using the Thread class:");

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // start() creates a new thread and automatically calls run().
        t1.start();
        t2.start();

        try {

            // Wait until both threads finish.
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Creating Threads using the Runnable interface:");

        
        
        // Runnable only defines the task.
        MyTask task = new MyTask();
 
        // Thread object is responsible for executing the Runnable.
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);

        t3.start();
        t4.start();

        try {

            t3.join();
            t4.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Threads have finished execution.");

    }

}