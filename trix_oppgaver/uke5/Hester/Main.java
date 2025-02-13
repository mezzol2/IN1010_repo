class Main{
    public static void main(String[] args) {
        EngelskFullblodshest e = new EngelskFullblodshest("Ed", 1);
        PasoFino p = new PasoFino("Paul", 2);
        Islandshest i = new Islandshest("Igor", 3);

        e.skritt();
        e.trav();
        e.galopp();
        System.out.println();
        p.toelt();
        System.out.println();
        i.toelt();
        i.pass();
    }
}