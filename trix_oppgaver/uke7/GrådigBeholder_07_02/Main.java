class Main {
    public static void main(String[] args) {
        Katt cat1 = new Katt("Billie", 8);
        Katt cat2 = new Katt("Snoot", 3);
        Katt cat3 = new Katt("Juice Box",0);

        Greedy<Katt> box = new Greedy<Katt>();

        box.setIn(cat2);
        System.out.println(box.getObject());
        box.setIn(cat1);
        System.out.println(box.getObject());
        box.setIn(cat3);
        System.out.println(box.getObject());
    }    
}
