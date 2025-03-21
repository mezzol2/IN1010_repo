class EveryTen implements Runnable{
    private int num;
    private NumberMonitor numberMonitor;

    EveryTen(int num, NumberMonitor numberMonitor){
        this.num = num;
        this.numberMonitor = numberMonitor;
    }
    
    @Override
    public void run(){
        for (int i=5; i <= 1000; i+=10){
            numberMonitor.printNumber(i, num);
        }
    }
}