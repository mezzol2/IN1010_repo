import java.util.concurrent.CountDownLatch;

class Main{
    public static void main(String[] args){
        KnivMonitor knivMonitor = new KnivMonitor();
        SaksMonitor saksMonitor = new SaksMonitor();
        int antallKniv = 100000;
        int knivPerProdusent = 100;

        int antallKnivProdusent = antallKniv / knivPerProdusent;
        CountDownLatch latch = new CountDownLatch(antallKnivProdusent);
        

        for (int i = 0; i < antallKnivProdusent; i++){
            Runnable knivProdusent = new KnivProdusent(knivMonitor, knivPerProdusent, latch);
            Thread thread = new Thread(knivProdusent);
            thread.start();
        }

        System.out.println("knife making threads are made");


        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println("Knife production interrupted.");
            System.exit(1);
        }

        System.out.println("knife threads are released");

        int antallSaksProdusent = 200;
        CountDownLatch latch2 = new CountDownLatch(antallSaksProdusent);
        for (int i = 0; i < antallSaksProdusent; i++){
            Runnable saksProdusent = new SaksProdusent(saksMonitor, knivMonitor, latch2);
            Thread thread = new Thread(saksProdusent);
            thread.start();
        }

        System.out.println("Scissor making threads are made");
        
        try{
            latch2.await();
        } catch (InterruptedException e){
            System.out.println("Scissor production interrupted.");
            System.exit(1);
        }

        

        System.out.println("There are "+saksMonitor.antallSaks()+" scissors.");

    }
}