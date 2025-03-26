import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

class Postkontor{
    private Post[] postLageret = new Post[10];
    private Lock lock = new ReentrantLock();
    private Condition lagerIkkeFult = lock.newCondition();
    private Condition lagerIkkeTomt = lock.newCondition();
    private int ledigPlass = 0;


    public void leverPost(Post post){//Same 
        lock.lock();
        try{
            while (ledigPlass == 10){
                lagerIkkeFult.await();
            }
            
            //Put the post in postLageret
            postLageret[ledigPlass] = post;
            ledigPlass++;
            lagerIkkeTomt.signalAll();

        } catch (InterruptedException e){
            System.out.println("Post Office exlpoded becuase it was so full.");
            System.exit(1);
        } finally{
            lock.unlock();
        }

    }

    public Post hentPost(String kundeNavn){
        lock.lock();
        try {
            while (ledigPlass == 0){
                lagerIkkeTomt.await();
            }

            //Check if there is Post for the customer
            for(Post post: postLageret){
                if (post != null && kundeNavn.equals(post.hentMottaker())){
                    ledigPlass--;
                    postLageret[ledigPlass] = null;
                    lagerIkkeFult.signalAll();
                    return post;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(kundeNavn+" goes home because there are no more packages to get.");
            System.exit(1);
        } finally{
            lock.unlock();
        }
        //If there is no Post for the Kunde, return null
        return null;
    }

}