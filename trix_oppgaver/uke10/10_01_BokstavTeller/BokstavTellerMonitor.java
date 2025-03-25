import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

class BokstavTellerMonitor{
    ArrayList<String> wordList;
    char letter;
    Lock lock = new ReentrantLock();

    BokstavTellerMonitor(ArrayList<String> wordList, char letter){
        this.wordList = wordList;
        this.letter = letter;
    }

    public String hentOrd(){
        lock.lock();

        try{
            //Empty List
            if(wordList.size() == 0){
                return null;
            }
            return wordList.removeLast();
        } finally{
            lock.unlock();
        }
    }

    public char hentBokstav(){
        return letter;
    }

}