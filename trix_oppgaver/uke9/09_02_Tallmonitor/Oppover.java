class Oppover implements Runnable{
    //private int tall = Integer.MIN_VALUE;
    private int tall;
    private TallMonitor tallMonitor;

    Oppover(TallMonitor tallMonitor){
        this.tallMonitor = tallMonitor;
        tall = Integer.MIN_VALUE;
    }

    @Override
    public void run(){
        while (tallMonitor.settMinste(tall)){
            tall++;
        }

        System.out.println("Done.  Number is no londer larger: "+tall);
    }
}