class MyRunnableTask implements Runnable{

    int amount;
    Bank bank;
    int threadNum;

    MyRunnableTask(Bank bank, int threadNum, int amount){
        this.bank = bank;
        this.amount = amount;
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++) {
            try{
                bank.ta(amount);
            } catch (InterruptedException e){
                System.out.println("Not enough money");
            }
            bank.gi(amount);
            System.out.println("Thread"+threadNum+": Amount in the bank: "+bank.saldo());
            //try {
            //    Thread.sleep(500);
            //} catch (Exception e) {
            //}
        }
    }
    
}