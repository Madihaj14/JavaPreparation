/*
 * Notes.java
 * Complete structured notes + runnable examples for Java multithreading.
 *
 * How to use:
 *  - Save as Notes.java and compile: javac Notes.java
 *  - Run: java Notes
 *
 * This file includes detailed theory notes (as comments) and runnable demos.
 */

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Notes {

    /*
     * =============================
     * 1) Introduction to Multithreading
     * =============================
     * - A thread is a lightweight sub-process, the smallest unit of execution.
     * - Multithreading means running multiple threads (tasks) concurrently.
     * - Useful for multitasking and better CPU utilization.
     * - Every Java program starts with the main thread.
     *
     * Example use cases:
     *   - A web server handles multiple requests simultaneously.
     *   - A GUI app stays responsive while performing background work.
     */

    /*
     * =============================
     * 2) Creating Threads
     * =============================
     * Two approaches:
     *   a) Extending Thread class and overriding run()
     *   b) Implementing Runnable interface and passing it to a Thread object
     *
     * Example:
     */

    static class MyThread extends Thread {
        public void run() {
            System.out.println("[MyThread] Thread is running (extends Thread)");
        }
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("[MyRunnable] Runnable thread is running (implements Runnable)");
        }
    }

    /*
     * Runnable vs Thread:
     * - Extending Thread: simple, but Java supports only single inheritance.
     * - Implementing Runnable: better design, separates task from execution.
     */

    /*
     * =============================
     * 3) Multiple Threads
     * =============================
     * - Multiple threads can run concurrently.
     * - Execution order is not guaranteed (depends on CPU scheduling).
     */

    static class MultiThreadDemo extends Thread {
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
                try { Thread.sleep(50); } catch (InterruptedException ignored) {}
            }
        }
    }

    /*
     * =============================
     * 4) Thread Lifecycle & States
     * =============================
     * States of a thread:
     *   - NEW: created but not started.
     *   - RUNNABLE: ready to run, waiting for CPU.
     *   - RUNNING: currently executing.
     *   - WAITING: waiting indefinitely.
     *   - TIMED_WAITING: waiting for a specified time (e.g., sleep).
     *   - TERMINATED: finished execution.
     */

    static class StateDemo {
        static void demo() throws InterruptedException {
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(100);
                    System.out.println("[StateDemo] Thread body executed");
                } catch (InterruptedException e) {
                    System.out.println("[StateDemo] Interrupted");
                }
            });

            System.out.println("[StateDemo] State before start: " + t.getState()); // NEW
            t.start();
            System.out.println("[StateDemo] State after start: " + t.getState());  // RUNNABLE
            t.join();
            System.out.println("[StateDemo] State after completion: " + t.getState()); // TERMINATED
        }
    }

    /*
     * =============================
     * 5) Important Thread Methods
     * =============================
     * - start(): begins execution in a new thread.
     * - run(): code executed by the thread.
     * - sleep(ms): pause for given time.
     * - join(): wait for another thread to finish.
     * - interrupt(): signals a thread to stop waiting/sleeping.
     * - getName(), setName(), getPriority(), setPriority(): manage thread properties.
     */

    static class PrioritySleepDemo extends Thread {
        public void run() {
            for (int i = 1; i <= 3; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("[PrioritySleepDemo] interrupted");
                    return;
                }
                System.out.println(Thread.currentThread().getName() + " - " + i + " (priority=" + getPriority() + ")");
            }
        }
    }

    /*
     * =============================
     * 6) Synchronization & Race Conditions
     * =============================
     * - Race condition occurs when multiple threads update shared data simultaneously.
     * - Leads to inconsistent or wrong results.
     *
     * Fixes:
     *   - synchronized methods or blocks
     *   - Locks (e.g., ReentrantLock)
     *   - Atomic classes
     */

    static class Counter {
        private int count = 0;

        public void increment() { count++; } // unsafe
        public synchronized void safeIncrement() { count++; } // safe

        public int get() { return count; }
        public void reset() { count = 0; }
    }

    static void raceConditionDemo() throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> { for (int i = 0; i < 1000; i++) c.increment(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 1000; i++) c.increment(); });

        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("[Race] Final count (unsafe, expected 2000): " + c.get());

        c.reset();
        Thread s1 = new Thread(() -> { for (int i = 0; i < 1000; i++) c.safeIncrement(); });
        Thread s2 = new Thread(() -> { for (int i = 0; i < 1000; i++) c.safeIncrement(); });
        s1.start(); s2.start(); s1.join(); s2.join();
        System.out.println("[Race] Final count (safe): " + c.get());
    }

    /*
     * =============================
     * 7) Locks (ReentrantLock)
     * =============================
     * - Provides more control than synchronized.
     * - Must be manually locked and unlocked.
     */

    static class LockDemo {
        private int x = 0;
        private final ReentrantLock lock = new ReentrantLock();

        void increment() {
            lock.lock();
            try { x++; } finally { lock.unlock(); }
        }

        int get() { return x; }
    }

    static void lockDemo() throws InterruptedException {
        LockDemo ld = new LockDemo();
        Thread t1 = new Thread(() -> { for (int i = 0; i < 1000; i++) ld.increment(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 1000; i++) ld.increment(); });
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("[LockDemo] Final value: " + ld.get());
    }

    /*
     * =============================
     * 8) java.util.concurrent Utilities
     * =============================
     * - ExecutorService: manages thread pools.
     * - Callable & Future: tasks with return values.
     * - CountDownLatch: wait until other tasks finish.
     * - Semaphore: control access to resources.
     */

    static void executorDemo() throws Exception {
        ExecutorService ex = Executors.newFixedThreadPool(2);

        ex.submit(() -> System.out.println("[Executor] Runnable task"));

        Future<Integer> f = ex.submit(() -> {
            Thread.sleep(100);
            return 42;
        });
        System.out.println("[Executor] Callable result: " + f.get());

        CountDownLatch latch = new CountDownLatch(2);
        ex.submit(() -> { System.out.println("[Latch] task1 done"); latch.countDown(); });
        ex.submit(() -> { System.out.println("[Latch] task2 done"); latch.countDown(); });
        latch.await();
        System.out.println("[Latch] All tasks finished");

        ex.shutdown();
    }

    /*
     * =============================
     * 9) Best Practices
     * =============================
     * - Prefer ExecutorService over manual threads.
     * - Avoid deprecated methods (stop, suspend, resume).
     * - Keep shared data minimal and protect with synchronization/locks.
     * - Always handle InterruptedException.
     */

    /*
     * =============================
     * MAIN METHOD
     * =============================
     */

    public static void main(String[] args) throws Exception {
        System.out.println("=== Thread Creation ===");
        MyThread mt = new MyThread();
        mt.start();

        Thread r = new Thread(new MyRunnable());
        r.start();
        mt.join(); r.join();

        System.out.println("=== Multiple Threads ===");
        MultiThreadDemo a = new MultiThreadDemo();
        MultiThreadDemo b = new MultiThreadDemo();
        a.setName("Worker-A"); b.setName("Worker-B");
        a.start(); b.start();
        a.join(); b.join();

        System.out.println("=== Priority & Sleep ===");
        PrioritySleepDemo p1 = new PrioritySleepDemo();
        PrioritySleepDemo p2 = new PrioritySleepDemo();
        p1.setName("P1"); p2.setName("P2");
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);
        p1.start(); p2.start();
        p1.join(); p2.join();

        System.out.println("=== Race Condition Demo ===");
        raceConditionDemo();

        System.out.println("=== Lock Demo ===");
        lockDemo();

        System.out.println("=== Executor Demo ===");
        executorDemo();

        System.out.println("=== State Demo ===");
        StateDemo.demo();

        System.out.println("=== All demos finished ===");
    }
}
