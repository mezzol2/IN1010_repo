import java.util.HashMap;

class Main{
    public static void main(String[] args){
        GUI gui = new GUI();
        HashMap<Integer,char[]> hashMap = new HashMap<>();
        hashMap.put(0,new char[]{'h','e','l','l','o'});
        hashMap.put(1,new char[]{'t','h','e','r','e'});

        Monitor monitor = new Monitor(hashMap, gui);

        int numThreads = hashMap.size();

        Thread[] threadArray = new Thread[2]; 

        for (int i = 0; i < numThreads; i++){
            Runnable wordCombiner = new WordCombiner(monitor, i);
            Thread thread = new Thread(wordCombiner);
            thread.start();
            threadArray[i] = thread;
        }

        //For testing and debugging purposes
        // monitor.printInfo();
        // System.out.println("done");
    }
}