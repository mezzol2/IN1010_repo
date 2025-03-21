class Main{
    public static void main(String[] args){
        TallMonitor tallMonitor = new TallMonitor();

        Nedover down = new Nedover(tallMonitor);
        Thread downThread = new Thread(down);
        

        Oppover up = new Oppover(tallMonitor);
        Thread upThread = new Thread(up);

        downThread.start();
        upThread.start();

    }
}