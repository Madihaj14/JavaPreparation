public class Notes {
    
    /*
    Multithreading in Java

    1. What is a Thread?
       - A thread is a lightweight subprocess, the smallest unit of processing that can be scheduled by an operating system.
       - It is a separate path of execution within a program.
       - A thread is the smallest unit of execution.
       - Every Java program runs on a main thread by default.
       - Threads help in multitasking and better CPU utilization.

    For Example:
         - A web server can handle multiple requests simultaneously using threads.
         - A GUI application can remain responsive while performing background tasks using threads.

    */

    class MyThread extends Thread {
        public void run() {
            System.out.println("Thread is running...");
        }
    }  

    class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Runnable thread is running...");
        }
    }


    /*
    2. Creating Threads
       - There are two main ways to create threads in Java:
         a. Extending the Thread class
         b. Implementing the Runnable interface


    /*

    3. MULTIPLE THREADS
    - Multiple threads can run concurrently.
    - Output order is not guaranteed (depends on CPU scheduling).
    */

    class MultiThreadDemo extends Thread {
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        }
    }


    /*
    4. Thread Lifecycle
       - New: A thread that is created but not yet started.
       - Runnable: A thread that is ready to run and waiting for CPU time.
       - Running: A thread that is currently executing.
       - Blocked/Waiting: A thread that is waiting for a resource or another thread to complete.
       - Terminated: A thread that has completed its execution.

    4. Thread Methods
       - start(): Starts the execution of the thread.
       - run(): Contains the code that constitutes the new thread's task.
       - sleep(long millis): Pauses the thread for a specified time.
       - join(): Waits for a thread to die.
       - interrupt(): Interrupts a thread.

    5. Synchronization
       - Synchronization is used to control access to shared resources by multiple threads to prevent data inconsistency.
       - Synchronized methods and blocks can be used to achieve this.

    6. Thread Priorities
       - Each thread has a priority that helps the thread scheduler decide when to switch from one thread to another.
       - Priorities range from MIN_PRIORITY (1) to MAX_PRIORITY (10), with NORM_PRIORITY (5) as the default.

    7. Concurrency Utilities
       - Java provides several concurrency utilities in the java.util.concurrent package, such as ExecutorService, CountDownLatch, and Semaphore, to help manage threads more effectively.

    8. Best Practices
       - Avoid using Thread.stop(), Thread.suspend(), and Thread.resume() as they are deprecated and unsafe.
       - Use higher-level concurrency constructs from java.util.concurrent package instead of low-level threading mechanisms.
       - Always handle InterruptedException properly.

    */




/*
  3. THREAD PRIORITY AND SLEEP
  - Thread priority ranges from 1 (MIN) to 10 (MAX).
  - Default priority = 5 (NORM).
  - sleep(ms) pauses the thread temporarily.
*/

class PrioritySleepDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(500); // pause for 0.5 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

/*
  4. RUNNABLE vs THREAD
  - Extending Thread: simple but limits inheritance.
  - Implementing Runnable: recommended, allows flexibility.
*/

/*
  5. RACE CONDITION
  - Occurs when multiple threads update shared data simultaneously.
  - Can produce incorrect results.
  - Fix: use synchronization.
*/

class Counter {
    int count = 0;
    public void increment() {
        count++;
    }
}

class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Final count (expected 2000): " + c.count);
    }
}

/*
  6. THREAD STATES
  - NEW: created but not started.
  - RUNNABLE: ready to run, waiting for CPU.
  - RUNNING: currently executing.
  - WAITING: waiting indefinitely.
  - TIMED_WAITING: waiting for a specified time.
  - TERMINATED: finished execution.
*/

class StateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(100);
                System.out.println("Thread running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("State before start: " + t.getState()); // NEW
        t.start();
        System.out.println("State after start: " + t.getState());  // RUNNABLE / RUNNING
        t.join();
        System.out.println("State after completion: " + t.getState()); // TERMINATED
    }
}

/*
  =======================
  MAIN CLASS TO TEST ALL
  =======================
  - Uncomment sections one by one to test.
*/

public class Notes {
    public static void main(String[] args) throws InterruptedException {

        // ---- THREAD CREATION ----
        MyThread t1 = new MyThread();
        t1.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        // ---- MULTIPLE THREADS ----
        MultiThreadDemo m1 = new MultiThreadDemo();
        MultiThreadDemo m2 = new MultiThreadDemo();
        m1.start();
        m2.start();

        // ---- PRIORITY & SLEEP ----
        PrioritySleepDemo p1 = new PrioritySleepDemo();
        PrioritySleepDemo p2 = new PrioritySleepDemo();
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);
        p1.start();
        p2.start();

        // For RaceConditionDemo and StateDemo,
        // run them separately since they have their own main methods.
    }
}

    

}
