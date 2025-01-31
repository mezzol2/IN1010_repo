class TestBaathus{
    public static void main(String[] args) {
        Baat boat1 = new Baat("Mercruiser");
        Baathus myBaathus = new Baathus(0);
        Baathus myBaathus2 = new Baathus(3);

        System.out.println();

        myBaathus.settInn(boat1);

        System.out.println();
        myBaathus2.settInn(boat1);

        Baat boat2 = new Baat("Ford");
        myBaathus2.settInn(boat2);
        Baat boat3 = new Baat("Outland");
        Baat boat4 = new Baat("Pleasure Craft");
        myBaathus2.settInn(boat3);
        myBaathus2.settInn(boat4);




        System.out.println();
        myBaathus2.skrivBaater();
    }
}