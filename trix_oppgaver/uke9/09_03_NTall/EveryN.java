class EveryN implements Runnable {
    private int inc, start, max, threadNum;
    NumberMonitor numberMonitor;

    EveryN(int inc, int start, int max, NumberMonitor numberMonitor, int threadNum){
        this.inc = inc;
        this.start = start;
        this.max = max;
        this.numberMonitor = numberMonitor;
        this.threadNum = threadNum;
    }

    @Override
    public void run(){
        for (int i = start; i <= max; i += inc){
            numberMonitor.printNumber(i, threadNum);
        }
    }
}
