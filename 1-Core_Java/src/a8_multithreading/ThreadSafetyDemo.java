package a8_multithreading;


// Shared object
class UnsafeCounter implements Runnable {

    private int count = 0;				// Not Thread-safe

    @Override
    public void run() {
        // Instance variable is shared between threads using the same object.
        for (int i = 1; i <= 1000; i++) {
            count++;
        }

        System.out.println(Thread.currentThread().getName() + " - Shared Count : " + count);
    }

}

// Each thread has its own local variable.
class SafeCounter implements Runnable {

    @Override
    public void run() {
        // Local variables belong to the current thread only.
        int localCount = 0;				// Thread-safe
        for (int i = 1; i <= 1000; i++) {
            localCount++;
        }

        System.out.println(Thread.currentThread().getName() + " - Local Count : " + localCount);
    }

}

public class ThreadSafetyDemo {

    public static void main(String[] args) {

        System.out.println("Unsafe Example:");

        // Both threads share the same object.
        UnsafeCounter unsafeCounter = new UnsafeCounter();

        Thread t1 = new Thread(unsafeCounter);
        Thread t2 = new Thread(unsafeCounter);

        t1.start();
        t2.start();
        
        try {

            // Wait for both unsafe threads to finish.
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        System.out.println("Safe Example:");
        
        // Both threads share the same object.
        SafeCounter safeCounter = new SafeCounter();

        Thread t3 = new Thread(safeCounter);
        Thread t4 = new Thread(safeCounter);

        t3.start();
        t4.start();
        
        
        try {

            // Wait for both safe threads to finish.
            t3.join();
            t4.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println();
        System.out.println("Thread Safety Demonstration Completed.");
    }

}