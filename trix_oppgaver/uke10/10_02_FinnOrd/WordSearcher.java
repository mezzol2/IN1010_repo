import java.util.concurrent.CountDownLatch;

class WordSearcher implements Runnable{
    int start;
    int end;
    String word;
    String[] words;
    WordMonitor wordMonitor;
    CountDownLatch latch;

    WordSearcher(int start, int end, String word, String[] words, WordMonitor wordMonitor, CountDownLatch latch){
        this.start = start;
        this.end = end;
        this.word = word;
        this.words = words;
        this.wordMonitor = wordMonitor;
        this.latch = latch;
    }

    @Override
    public void run(){
        int wordCount = 0;

        for (int i = start; i < end; i++){ //check if should be < or <=
            if (word.equals(words[i])){
                wordCount++;
            }
        }

        wordMonitor.addNumberOccurances(wordCount);
        latch.countDown();
    }

}
