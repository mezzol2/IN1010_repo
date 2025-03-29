import java.util.concurrent.CountDownLatch;

class SaksProdusent implements Runnable{
    private KnivMonitor knivMonitor;
    private SaksMonitor saksMonitor;
    private CountDownLatch latch;

    SaksProdusent(SaksMonitor saksMonitor, KnivMonitor knivMonitor, CountDownLatch latch){
        this.knivMonitor = knivMonitor;
        this.saksMonitor = saksMonitor;
        this.latch = latch;
    }
    
    @Override
    public void run(){
        while(knivMonitor.antall() >= 2){
            //Get 2 knives from kniveMonitor and use them to create saks
            Kniv[] toKniver = knivMonitor.taUtTo();
            
            if (toKniver != null){
                Saks saks = new Saks(toKniver);
                saksMonitor.settInnSaks(saks);
            }
        }

        latch.countDown();
    }
}