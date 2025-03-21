class Nedover implements Runnable{
    //private int tall = Integer.MAX_VALUE;
    private int tall;
    private TallMonitor tallMonitor;

    Nedover(TallMonitor tallMonitor){
        this.tallMonitor = tallMonitor;
        tall = Integer.MAX_VALUE;
    }

    @Override
    public void run(){
        while (tallMonitor.settStorste(tall)) {
            tall--;
        }

        System.out.println("Done.  Number is no longer larger: "+tall);
    }

}