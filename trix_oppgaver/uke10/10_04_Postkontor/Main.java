import java.util.concurrent.CountDownLatch;

class Main{
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(100);
        Postkontor postkontor = new Postkontor();
        
        //Create and run Postmann
        Runnable postmann = new Postmann(postkontor);
        Thread thread1 = new Thread(postmann);
        thread1.start();

        //Create Luffy Kunde
        Runnable luffy = new Kunde("Luffy", latch, postkontor);
        Thread thread2 = new Thread(luffy);
        thread2.start();

        //Create Bilbo Kunde
        Runnable bilbo = new Kunde("Bilbo Baggins", latch, postkontor);
        Thread thread3 = new Thread(bilbo);
        thread3.start();

        //Create Harry Kunde
        Runnable harry = new Kunde("Harry Potter", latch, postkontor);
        Thread thread4 = new Thread(harry);
        thread4.start();

        try {
            latch.await();
        } catch (Exception e) {
            System.out.println("BIG ERROR");
            System.exit(1);
        }

        System.out.println("All post has been picked up");

        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();
        thread4.interrupt();
    }
}