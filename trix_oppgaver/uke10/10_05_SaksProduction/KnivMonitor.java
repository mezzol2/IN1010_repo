import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class KnivMonitor{
    private ArrayList<Kniv> knivListe = new ArrayList<>();
    private Lock lock = new ReentrantLock();

    public int antall(){
        return knivListe.size();
    }
    
    public void settInn(Kniv kniv){
        lock.lock();
        knivListe.add(kniv);
        lock.unlock();
    }

    public Kniv[] taUtTo(){
        lock.lock();
        try {
            if(antall() < 2){
                return null;
            }
            Kniv[] toKniver = new Kniv[2];
            toKniver[0] = knivListe.removeFirst();
            toKniver[1] = knivListe.removeFirst();
            return toKniver;
        }finally{
            lock.unlock();
        }
    }
}