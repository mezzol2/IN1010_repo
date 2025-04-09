class WithHBO extends SubDecorator{
    WithHBO(Subscription sub){
        super(sub);
    }

    @Override
    public int getPrice(){
        return decoratedSub.getPrice() + 150;
    }

    @Override
    public String getInfo(){
        return decoratedSub.getInfo() + " + HBO";
    }
}