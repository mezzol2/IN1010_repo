class WordCombiner implements Runnable{
    Monitor monitor;
    char[] charArray = null;
    int ID;

    WordCombiner(Monitor monitor, int ID){
        this.monitor = monitor;
        this.ID = ID;
    }

    public void run(){
        //get array from monitor
        charArray = monitor.getCharArray(ID);
        String word = new String(charArray);
        
        //have the Thread sleep
        try{
            Thread.sleep(2000+(1000*ID));
        } catch (InterruptedException e){
            System.out.println("Thread's sleep interrupted.");
        }

        //Send word back to monitor
        monitor.insertWord(word, ID);
    }
}