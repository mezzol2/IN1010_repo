import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.io.File;
import java.io.FileNotFoundException;

class FinnAntall{
    public static void main(String[] args) {
        String word = args[0].toLowerCase();
        String filename = args[1];
        int threadCount = 0;
        int wordCount = 0;
        String[] words = null;
        
        try {
            threadCount = Integer.parseInt(args[2]);
        } catch (Exception e) {
            System.out.println(args[2]+" is not an integer.  Please enter a valid number and try again.");
            System.exit(1);
        }

        try{
            Scanner file = new Scanner(new File(filename));
            
            try {
                wordCount = file.nextInt();
            } catch (Exception e) {
                System.out.println("First line of "+filename+" is not an integer.  Please try a different file.");
                System.exit(1);
            }

            words = new String[wordCount];
            int i = 0;
            //increment to the next line as the nextInt function does not do this automatically
            file.nextLine();

            while (file.hasNextLine()){
                words[i] = file.nextLine().toLowerCase().strip();
                i++;   
            }
            file.close();
       
        } catch(FileNotFoundException e ){
            System.out.println(filename+" not found.  Please try again.");
            System.exit(1);
        }

        CountDownLatch latch = new CountDownLatch(threadCount);
        WordMonitor wordMonitor = new WordMonitor(word);
        int wordsPerThread = wordCount / threadCount;
        int start = 0;
        int end = start + wordsPerThread;

        //Make threads
        for (int i = 0; i < threadCount; i++){
            //Check that not last thread
            if (i != threadCount-1){
                Runnable wordSearcher = new WordSearcher(start, end, word, words, wordMonitor, latch);
                Thread thread = new Thread(wordSearcher);
                thread.start();
                start = end;
                end = start + wordsPerThread; //end not inclusive
            } else{
                Runnable wordSearcher = new WordSearcher(start, wordCount, word, words, wordMonitor, latch);
                Thread thread = new Thread(wordSearcher);
                thread.start();
            }


        }

        
        // Runnable wordSearcher = new WordSearcher(0, wordCount, word, words, wordMonitor, latch);
        // Thread thread = new Thread(wordSearcher);
        // thread.start();

        try {
            latch.await();
        } catch (Exception e) {
            System.out.println("Process interrupted");
            System.exit(1);
        }

        wordMonitor.printOccurances();
    }
}