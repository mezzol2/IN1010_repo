class Main {
    public static void main(String[] args){

        NumberMonitor numberMonitor = new NumberMonitor();

        // for (int i = 1; i <= 10; i++){
        //     Runnable everyTen = new EveryTen(i, numberMonitor);
        //     Thread thread = new Thread(everyTen);
        //     thread.start();
        // }

        for (int i = 0; i <= 9; i++){
            Runnable everyN = new EveryN(10,i , 10000, numberMonitor, i);
            Thread thread = new Thread(everyN);
            thread.start();
        }
    }    
}
