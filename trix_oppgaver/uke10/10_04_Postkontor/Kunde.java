import java.util.concurrent.CountDownLatch;

class Kunde implements Runnable{
    private String navn;
    private CountDownLatch latch;
    private Post post;
    private Postkontor postkontor;

    Kunde(String navn, CountDownLatch latch, Postkontor postkontor){
        this.navn = navn;
        this.latch = latch;
        this.postkontor = postkontor;
    }

    public void run(){
        //wait in line
        //get package
        //wait in line again
        while(latch.getCount() > 0){
            post = postkontor.hentPost(navn);
            if (post != null){
                latch.countDown();
                System.out.println(latch.getCount());
                System.out.println(navn+" hentet "+post.hentBeskrivelse()+".");
            }
        }
    }
}