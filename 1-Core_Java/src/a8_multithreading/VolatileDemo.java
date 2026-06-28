package a8_multithreading;

class VolatileWorker extends Thread {

    // volatile ensures that changes made by one thread are immediately visible to other threads.
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Worker Thread is running...");
        }

        System.out.println("Worker Thread stopped.");
    }

    public void stopRunning() {
        running = false;
    }

}

public class VolatileDemo {

    public static void main(String[] args) {

        VolatileWorker worker = new VolatileWorker();

        worker.start();

        try {
            // Main thread waits for 2 seconds.
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stopping Worker Thread...");
        
        worker.stopRunning();

    }

}