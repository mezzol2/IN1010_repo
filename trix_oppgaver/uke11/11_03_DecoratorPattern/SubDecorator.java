abstract class SubDecorator implements Subscription{
    protected final Subscription decoratedSub;

    public SubDecorator(Subscription sub){
        this.decoratedSub = sub;
    }

    
    public abstract int getPrice();

  
    public abstract String getInfo();

    @Override
    public String toString(){
        return getInfo()+": "+getPrice();
    }
}