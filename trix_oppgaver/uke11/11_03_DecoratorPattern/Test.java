class Test{
    public static void main(String[] args){
        Subscription sub = new BasicSub();
        System.out.println(sub);

        sub = new With4K(sub);
        System.out.println(sub);

        sub = new WithHBO(sub);
        System.out.println(sub);
    }
}