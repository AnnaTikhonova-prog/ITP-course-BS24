import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int counter = 0;
    private final ReentrantLock mutex = new ReentrantLock();

    public void increment() {
        mutex.lock();
        try {
            counter++;
        } finally {
            mutex.unlock();
        }
    }

    public int getValue() {
        mutex.lock();
        try {
            return counter;
        } finally {
            mutex.unlock();
        }
    }
}
