import java.util.concurrent.CountDownLatch;

class KnivProdusent implements Runnable{
    private KnivMonitor knivMonitor;
    private int kniverÅLage;
    private CountDownLatch latch;

    KnivProdusent(KnivMonitor knivMonitor, int kniverÅLage, CountDownLatch latch){
        this.knivMonitor = knivMonitor;
        this.kniverÅLage = kniverÅLage;
        this.latch = latch;
    }

    @Override
    public void run(){
        for (int i = 0; i < kniverÅLage; i++){
            Kniv kniv = new Kniv();
            knivMonitor.settInn(kniv);
        }
        latch.countDown();
    }
}