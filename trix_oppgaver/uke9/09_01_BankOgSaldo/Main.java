class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        //Thread[] threads= new Thread[25];

        for (int i = 1; i <= 25; i++){
            Runnable toRun = new MyRunnableTask(bank,i, 100);
            Thread thread = new Thread(toRun);
            thread.start();
           
        }
    }    
}
