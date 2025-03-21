import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

class NumberMonitor {
    private Lock lock = new ReentrantLock();
    private int next = 0;
    private Condition notNext = lock.newCondition();


    public void printNumber (int numIn, int threadNum){
        lock.lock();
        try{
            while (numIn != next) {
                notNext.await();
            }
                next++;
                System.out.println("Thread number "+threadNum+": "+numIn);
                notNext.signalAll();
        } catch (InterruptedException e){
            System.err.println("ERROR on thread "+threadNum);
        }finally{
            lock.unlock();
        }
    }
}
