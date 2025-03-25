import java.util.concurrent.CountDownLatch;

class Main {
    public static void main(String[] args) {
        final int voterCount = 435;
        CountDownLatch latch = new CountDownLatch(voterCount);
        BallotBox ballotBox = new BallotBox();

        for(int i = 0; i < voterCount; i++){
            Runnable voter = new Voter(ballotBox, latch);
            Thread thread = new Thread(voter);
            thread.start();
        }

        try{
            latch.await();
        } catch (InterruptedException e){
            System.out.println("ELECTION INTERFERENCE");
            System.exit(1);
        }

        ballotBox.announceResults();
    }   
}