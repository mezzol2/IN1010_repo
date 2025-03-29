import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SaksMonitor{
    private ArrayList<Saks> saksListe = new ArrayList<>();
    private Lock lock = new ReentrantLock();

    public int antallSaks(){
        return saksListe.size();
    }

    public void settInnSaks(Saks saks){
        lock.lock();
        saksListe.add(saks);
        lock.unlock();
    }
}