package a8_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// Runnable defines the task to be executed.
class Task implements Runnable {

    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
    }

}

public class ThreadPoolDemo {

    public static void main(String[] args) {

        // Creates a thread pool containing 3 worker threads.
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Submit 6 tasks to the thread pool.
        for (int i = 1; i <= 6; i++) {
            service.submit(new Task(i));
        }

        // Stops accepting new tasks and shuts down the thread pool after completing all submitted tasks.
        service.shutdown();

    }

}