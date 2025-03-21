import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TallMonitor{
    int detMinste = Integer.MIN_VALUE;
    int detStorste = Integer.MAX_VALUE;
    Lock lock = new ReentrantLock();

    public boolean settMinste(int nyttTall) {
        lock.lock();
        try{
            if (nyttTall < detStorste){
                detMinste = nyttTall;
                return true;
            } else{
                return false;
            }
        } finally{
            lock.unlock();
        }
    }

    public boolean settStorste(int nyttTall){
        lock.lock();
        try{
            if (nyttTall > detMinste){
                detStorste = nyttTall;
                return true;
            } else{
                return false;
            }
        } finally {
            lock.unlock();
        }
    }

}