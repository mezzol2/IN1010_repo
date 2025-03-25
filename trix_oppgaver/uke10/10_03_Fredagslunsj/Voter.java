import java.util.Random;
import java.util.concurrent.CountDownLatch;

class Voter implements Runnable{
    private BallotBox ballotBox;
    private CountDownLatch latch;

    Voter(BallotBox ballotBox, CountDownLatch latch){
        this.ballotBox = ballotBox;
        this.latch = latch;
    }
    
    @Override
    public void run(){
        boolean vote = new Random().nextBoolean();  //randomly generates a boolean value
        ballotBox.castVote(vote);
        latch.countDown();
    }

}
