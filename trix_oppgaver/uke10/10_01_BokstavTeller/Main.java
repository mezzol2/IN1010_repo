import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("Hello,");
        wordList.add("how");
        wordList.add("are");
        wordList.add("you");
        wordList.add("doing");
        wordList.add("today");
        char letter = 'o';
        BokstavTellerMonitor btm = new BokstavTellerMonitor(wordList, letter);

        Runnable bokstavTeller = new BokstavTeller(btm);
        Thread thread = new Thread(bokstavTeller);
        thread.start();
    }    
}
