import java.util.Collections;
import java.util.ArrayList;

class SortingThread implements Runnable{
    private ArrayList<String> words = new ArrayList<>();
    private WordMonitor wordMonitor;

    SortingThread(WordMonitor wordMonitor){
        this.wordMonitor = wordMonitor;
    }

    public void run(){
        words = wordMonitor.wordsToSort(0, 0);
    }
}
