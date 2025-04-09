class BasicSub implements Subscription{
    private int price = 200;
    
    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public String getInfo(){
        return "Subscription";
    }

    @Override
    public String toString(){
        return getInfo() +": "+ price;
    }
}