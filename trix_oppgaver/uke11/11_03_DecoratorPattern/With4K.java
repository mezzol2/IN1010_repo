class With4K extends SubDecorator{
    With4K(Subscription sub){
        super(sub);
    }

    @Override
    public int getPrice() {
        return decoratedSub.getPrice()+100;
    }

    @Override
    public String getInfo(){
        return decoratedSub.getInfo() + " + 4K";
    }
}