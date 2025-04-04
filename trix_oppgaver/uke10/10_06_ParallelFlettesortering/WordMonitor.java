import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class WordMonitor {
    private ArrayList<String> wordList = new ArrayList<>();
    private Lock lock = new ReentrantLock();

    WordMonitor(Scanner file){
        this.readFile(file);
    }

    public void readFile(Scanner file){
        
        file.nextLine();
        while (file.hasNextLine()){
            wordList.add(file.nextLine());
        }
        
        //TEST
        //for (int i = 0; i < wordList.size(); i++){
        //    System.out.println(wordList.get(i));
        //}
    }

    public ArrayList<String> wordsToSort(int start, int end){
        lock.lock();
        try{
            return (ArrayList<String>) wordList.subList(start, end);
        } finally {
            lock.unlock();
        }
    }
}
