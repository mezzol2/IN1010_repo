import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BallotBox {
    int grøt = 0;
    int pannekaker = 0;
    Lock lock = new ReentrantLock();

    public void castVote(boolean vote){
        lock.lock();

        if (vote){  //true = grøt
            grøt++;
        } else{ //false = pannekaker
            pannekaker++;
        }

        lock.unlock();
    }

    public void announceResults(){
        if (grøt > pannekaker){
            System.out.println("Grøt vant "+grøt+" til "+pannekaker+".");
        } else{
            System.out.println("Pannekaker vant "+pannekaker+" til "+grøt+".");
        }
    }
}