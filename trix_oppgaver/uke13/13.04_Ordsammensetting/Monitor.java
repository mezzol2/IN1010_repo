import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Monitor{
    HashMap<Integer, char[]> hashMap;
    Lock lock = new ReentrantLock();
    GUI gui;
    int nextSpot = 0;
    String[] wordArray;
    
    Monitor(HashMap<Integer, char[]> hashMap, GUI gui){
        this.hashMap = hashMap;
        this.gui = gui;
        wordArray = new String[hashMap.size()];
    }

    public char[] getCharArray(int i){
        lock.lock();

        try{
            return (char[]) hashMap.get(i);
        } finally{
            lock.unlock();
        }
    }

    public void insertWord(String word, int ID){
        lock.lock();

        wordArray[ID] = word;
        gui.addWord(word);

        lock.unlock();
    }

    public void printInfo(){
        for (String word : wordArray){
            System.out.println(word);
        }
    }
}