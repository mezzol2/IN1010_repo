import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Bank {
    private int saldo = 100;

    Lock lock = new ReentrantLock();
    Condition moneyInBank = lock.newCondition();

    public void ta(int åTa) throws InterruptedException {
        lock.lock();
        try {
            while (saldo < åTa){
                moneyInBank.await();
            }
            saldo -= åTa;
        } finally {
            lock.unlock();
        }
    }

    public void gi(int åGi){
        lock.lock();
        try {
            saldo += åGi;
            moneyInBank.signalAll();
        } finally{
            lock.unlock();
        }
        
    }

    public int saldo(){
        lock.lock();
        try{
            return saldo;
        } finally{
            lock.unlock();
        }
    }
}
