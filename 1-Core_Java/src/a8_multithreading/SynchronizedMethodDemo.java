package a8_multithreading;

// Shared object accessed by multiple threads.
class Counter {

    private int count = 0;

    // Only one thread can execute this method on the same object at a time.
    public synchronized void increment() {							// Try removing 'synchronized' and check output
        count++;
    }

    public int getCount() {
        return count;
    }

}

public class SynchronizedMethodDemo {
    public static void main(String[] args) {
    	
        Counter counter = new Counter();
        
        
        Runnable task = new Runnable() {

            @Override
            public void run() {
                // Both threads increment the same shared variable.
                for (int i = 1; i <= 1000; i++) {
                    counter.increment();
                }
            }
        };
        
//        Using Lambda Expressions
//
//        Runnable task = () -> {
//
//            // Both threads increment the same shared variable.
//            for (int i = 1; i <= 1000; i++) {
//                counter.increment();
//            }
//        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish.
            t1.join();
            t2.join();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count : " + counter.getCount());

    }

}