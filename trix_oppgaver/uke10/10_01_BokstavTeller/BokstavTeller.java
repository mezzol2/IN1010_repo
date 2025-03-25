class BokstavTeller implements Runnable{
    String word;
    char c;
    BokstavTellerMonitor bokstavTellerMonitor;

    BokstavTeller(BokstavTellerMonitor bokstavTellerMonitor){
        this.bokstavTellerMonitor = bokstavTellerMonitor;
        this.c = bokstavTellerMonitor.hentBokstav();
    }

    @Override
    public void run(){
        word = bokstavTellerMonitor.hentOrd();
        
        while(word!=null){
            int counter = 0;
            char[] letters = word.toCharArray();

            for (char letter: letters){
                if (letter == c){
                    counter++;
                }
            }

            System.out.println("Instances of the letter '"+c+"' in the word '"+word+"': "+counter);

            word = bokstavTellerMonitor.hentOrd();
        }
    }    
}