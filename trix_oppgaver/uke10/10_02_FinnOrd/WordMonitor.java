import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class WordMonitor {
    int wordOccurances = 0;
    Lock lock = new ReentrantLock();
    String word;

    WordMonitor( String word){
        this.word = word;
    }

    public void addNumberOccurances(int occurances){
        lock.lock();
        try{
            wordOccurances += occurances;
        } finally{
            lock.unlock();
        }
    }

    public void printOccurances(){
        System.out.println("The word '"+word+"' appears "+wordOccurances+" times.");
    }
}
