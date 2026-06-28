package a8_multithreading;

// Shared object accessed by multiple threads.
class Printer {

    public void printNumbers() {

        System.out.println(Thread.currentThread().getName() + " is preparing to print.");

        // Only this block is synchronized.
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }

        System.out.println(Thread.currentThread().getName() + " finished printing.");

    }

}

 
class PrintTask extends Thread {

    private Printer printer;

    public PrintTask(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printNumbers();
    }

}

public class SynchronizedBlockDemo {

    public static void main(String[] args) {

        // Both threads share the same Printer object.
        Printer printer = new Printer();

        PrintTask t1 = new PrintTask(printer);
        PrintTask t2 = new PrintTask(printer);

        t1.start();
        t2.start();

        try {

            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Printing completed.");

    }

}