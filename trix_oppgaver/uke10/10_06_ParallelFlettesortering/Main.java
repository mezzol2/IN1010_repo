import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


class Main{
    public static void main(String[] args){
        String inputFilename = args[1];
        String outputFilename = args[2];
        int numberThreads = 0;
        Scanner file = null;
        int wordCount = 0;

        try{
            numberThreads = Integer.parseInt(args[0]);
        } catch (Exception e){
            System.out.println("Invalid input for number of thread.");
            System.exit(1);
        }

        try{
            file = new Scanner(new File(inputFilename));
        } catch (FileNotFoundException e){
            System.out.println("No file named "+inputFilename+" found.");
            System.exit(1);
        }

        try{
            wordCount = file.nextInt();
        } catch (Exception e){
            System.out.println("First line is not an integer value");
            System.exit(1);
        }

        WordMonitor wordMonitor = new WordMonitor(file);

        Runnable sorter = new SortingThread(wordMonitor);
        Thread thread = new Thread(sorter);
        sorter.start();

    }
}